package Venda;

import java.sql.SQLException;
import banco.BD;

public class VendaDAO extends Venda{

	private BD bd;
	private String men="",sql="";

	public VendaDAO (){
		bd=new BD();
	}

	public String inserirVenda(){
		if (bd.getConnection()){//para conectar com o banco, caso der errado ele vai pro else e vai dar erro

			try{

				sql="insert into venda (periodo,data_venda,cod_funcionario,cod_produto,valor_total,quantidade) values(?,?,?,?,?,?)";

				bd.st = bd.con.prepareStatement(sql);//st é uma classe que sabe executar funções em mysql

				bd.st.setString(1,getPeriodo());
				bd.st.setString(2,getData_venda());
				bd.st.setInt(3,getCod_funcionario());
				bd.st.setInt(4,getCod_produto());
				bd.st.setFloat(5,getValor_total());
				bd.st.setInt(6,getQuantidade());
				
				bd.st.executeUpdate();//aqui é executado o comando de insert.
				return "Venda concluida com sucesso";
			}
			catch (SQLException erro){
				return "Falha na inclusão"+erro.toString();
			}
			finally {//ele sempre passa aqui, mesmo depois do try ou do catch// finally é garante
				bd.Close();
			}
		}
		else {
			men="Falha na conexão ao banco de dados.";
		}
		return men;
	}
	public String alterarVenda (){
		if (bd.getConnection()){
			try{
				sql="update venda set periodo=?,data_venda=?,cod_funcionario=?,cod_produto=?,Valor_total=?,quantidade=? where cod_venda=?";
				bd.st = bd.con.prepareStatement(sql);//st é uma classe que sabe executar funções em mysql
				
				bd.st.setString(1,getPeriodo());
				bd.st.setString(2,getData_venda());
				bd.st.setInt(3,getCod_funcionario());
				bd.st.setInt(4,getCod_produto());
				bd.st.setFloat(5,getValor_total());
				bd.st.setInt(6,getQuantidade());
				bd.st.setInt(7,getCod_venda());


				int r = bd.st.executeUpdate();//aqui é executado o comando de insert.

				if (r==0){//r é o numero de linhas afetadas.
					return "venda não encontrado";				
				}
				else {
					return "Registro de venda alterado com sucesso";
				}

			}

			catch (SQLException erro){
				return "Falha na alteração !!!"+erro.toString();
			}
			finally {//ele sempre passa aqui, mesmo depois do try ou do catch// finally é garante
				bd.Close();
			}

		}
		else {
			men="Falha na conexão ao banco de dados.";
		}
		return men;
	}
	public Boolean procurarVenda (String codigo){
		/**
		 * localiza uma selecao apartir do codigo
		 */

		if (bd.getConnection()){
			try{

				sql = "select * from venda where cod_venda = ?";

				bd.st = bd.con.prepareStatement(sql);

				bd.st.setInt(1, getCod_venda());

				bd.rs = bd.st.executeQuery();//rs é um objeto que contem linhas e colunas como no mysql

				if (bd.rs.next()){

					return true;//objeto atual
				}
			}
			catch (SQLException erro){

			}
			finally{
				bd.Close();
			}
		}
		else {
			System.out.println("Falha na conxão.");
		}
		return false;
	}	
	public String excluirVenda (){
		if (bd.getConnection()){


			try{

				//definir a instrução
				//criar a o acesso
				//identificar o que tem que ser feito
				//executar.

				sql="delete from venda where cod_venda=?";//esse comando vai apagar os registros com o id fornecido.

				bd.st = bd.con.prepareStatement(sql);//st é uma classe que sabe executar funções em mysql

				bd.st.setInt(1, getCod_venda());

				int r= bd.st.executeUpdate();

				if (r==0){//r é o numero de linhas afetadas.
					return "Venda não encontrado";				
				}
				else {
					return "Venda excluida com sucesso";
				}
			}
			catch (SQLException erro){
				return "Falha na exclusão"+erro.toString();
			}
			finally {//ele sempre passa aqui, mesmo depois do try ou do catch// finally é garante
				bd.Close();
			}
		}
		else {
			men="Falha na conexão ao banco de dados.";
		}
		return men;
	}
	
}

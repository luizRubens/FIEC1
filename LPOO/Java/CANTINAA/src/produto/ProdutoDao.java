package produto;

import java.sql.SQLException;
import banco.BD;

public class ProdutoDao extends Produto {

	private BD bd;
	private String men="",sql="";

	public ProdutoDao (){
		bd=new BD();
	}

	public String inserirProduto(){
		if (bd.getConnection()){//para conectar com o banco, caso der errado ele vai pro else e vai dar erro

			try{

				sql="insert into produto (descricao,preco_venda,preco_custo,data_compra,data_venda,cod_fornecedor,quantidade) values(?,?,?,?,?,?,?)";

				bd.st = bd.con.prepareStatement(sql);//st é uma classe que sabe executar funções em mysql

				bd.st.setString(1,getDescricao());
				bd.st.setFloat(2,getPreco_venda());
				bd.st.setFloat(3,getPreco_custo());
				bd.st.setString(4,getData_compra());
				bd.st.setString(5,getData_venda());
				bd.st.setInt(6,getCod_fornecedor());
				bd.st.setInt(7,getQuantidade());

				bd.st.executeUpdate();//aqui é executado o comando de insert.
				return "produto incluido com sucesso";
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
	public String alterarProduto (){
		if (bd.getConnection()){
			try{
				sql="update produto set descricao=?,preco_venda=?,preco_custo=?,data_compra=?,data_venda=?,cod_fornecedor=?,quantidade=? where cod_produto=?";
				bd.st = bd.con.prepareStatement(sql);//st é uma classe que sabe executar funções em mysql
				bd.st.setString(1,getDescricao());
				bd.st.setFloat(2,getPreco_venda());
				bd.st.setFloat(3,getPreco_custo());
				bd.st.setString(4,getData_compra());
				bd.st.setString(5,getData_venda());
				bd.st.setInt(6,getCod_fornecedor());
				bd.st.setInt(7,getQuantidade());
				bd.st.setInt(8,getCod_produto());


				int r = bd.st.executeUpdate();//aqui é executado o comando de insert.

				if (r==0){//r é o numero de linhas afetadas.
					return "Produto não encontrado";				
				}
				else {
					return "produto alterado com sucesso";
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
	public Boolean procurarFuncionario (String codigo){
		/**
		 * localiza uma selecao apartir do codigo
		 */

		if (bd.getConnection()){
			try{

				sql = "select * from produto where cod_produto = ?";

				bd.st = bd.con.prepareStatement(sql);

				bd.st.setInt(1, getCod_produto());

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
	public String excluirProduto (){
		if (bd.getConnection()){


			try{

				//definir a instrução
				//criar a o acesso
				//identificar o que tem que ser feito
				//executar.

				sql="delete from produto where cod_produto=?";//esse comando vai apagar os registros com o id fornecido.

				bd.st = bd.con.prepareStatement(sql);//st é uma classe que sabe executar funções em mysql

				bd.st.setInt(1, getCod_produto());

				int r= bd.st.executeUpdate();

				if (r==0){//r é o numero de linhas afetadas.
					return "Produo não encontrado";				
				}
				else {
					return "Produto excluido com sucesso";
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

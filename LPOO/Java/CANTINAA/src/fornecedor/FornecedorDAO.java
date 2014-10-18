package fornecedor;

import java.sql.SQLException;

import banco.BD;

public class FornecedorDAO extends Fornecedor {


	private BD bd;
	private String men="",sql="";

	public FornecedorDAO (){
		bd=new BD();
	}

	public String inserirFornecedor(){
		if (bd.getConnection()){//para conectar com o banco, caso der errado ele vai pro else e vai dar erro

			try{
				sql="insert into fornecedor (endereco,numero,email,responsavel,telefone,cep,nome_empresa,descricao,bairro,cidade) values(?,?,?,?,?,?,?,?,?,?)";

				bd.st = bd.con.prepareStatement(sql);//st é uma classe que sabe executar funções em mysql

				bd.st.setString(1,getEndereco());
				bd.st.setInt(2,getNumero());
				bd.st.setString(3,getEmail());
				bd.st.setString(4,getResponsavel());
				bd.st.setString(5,getTelefone());
				bd.st.setString(6,getCep());
				bd.st.setString(7,getNome_empresa());
				bd.st.setString(8,getDescricao());
				bd.st.setString(9,getBairro());
				bd.st.setString(10,getCidade());

				bd.st.executeUpdate();//aqui é executado o comando de insert.
				return "Fornecedor incluido com sucesso";
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
	public String alterarFornecedor (){
		if (bd.getConnection()){
			try{
				sql="update fornecedor set endereco=?,numero=?,email=?,responsavel=?,telefone=?,cep=?,nome_empresa=?,descricao=?,bairro=?,cidade=? where cod_fornecedor=?";

				bd.st = bd.con.prepareStatement(sql);//st é uma classe que sabe executar funções em mysql

				bd.st.setString(1,getEndereco());
				bd.st.setInt(2,getNumero());
				bd.st.setString(3,getEmail());
				bd.st.setString(4,getResponsavel());
				bd.st.setString(5,getTelefone());
				bd.st.setString(6,getCep());
				bd.st.setString(7,getNome_empresa());
				bd.st.setString(8,getDescricao());
				bd.st.setString(9,getBairro());
				bd.st.setString(10,getCidade());				
				bd.st.setInt(11,getCod_fornecedor());

				int r = bd.st.executeUpdate();//aqui é executado o comando de insert.

				if (r==0){//r é o numero de linhas afetadas.
					return "Fornecedor não encontrado";				
				}
				else {
					return "Fornecedor alterado com sucesso";
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
	public Boolean procurarFornecedor (String codigo){
		/**
		 * localiza um fornecedor apartir do codigo
		 */

		if (bd.getConnection()){
			try{

				sql = "select * from funcionario where cod_funcionario = ?";
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setInt(1, getCod_fornecedor());
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
	public String excluirFornecedor (){
		if (bd.getConnection()){


			try{
				//definir a instrução
				//criar a o acesso
				//identificar o que tem que ser feito
				//executar.
				sql="delete from fornecedor where cod_fornecedor=?";//esse comando vai apagar os registros com o id fornecido.
				bd.st = bd.con.prepareStatement(sql);//st é uma classe que sabe executar funções em mysql
				bd.st.setInt(1, getCod_fornecedor());
				int r= bd.st.executeUpdate();
				if (r==0){//r é o numero de linhas afetadas.
					return "Fornecedor não encontrado";				
				}
				else {
					return "Fornecedor excluido com sucesso";
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

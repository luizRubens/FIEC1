package funcionario;

import java.sql.SQLException;

import banco.BD;

public class FuncionarioDAO extends Funcionario{


	private BD bd;
	private String men="",sql="";

	public FuncionarioDAO (){
		bd=new BD();
	}

	public String inserirFuncionario(){
		if (bd.getConnection()){//para conectar com o banco, caso der errado ele vai pro else e vai dar erro

			try{
				sql="insert into funcionario (nome,cargo,email,endereco,telefone,cpf,cep,numero,salario,complemento) values(?,?,?,?,?,?,?,?,?,?)";
				bd.st = bd.con.prepareStatement(sql);//st � uma classe que sabe executar fun��es em mysql
				bd.st.setString(1,getNome());
				bd.st.setString(2,getCargo());
				bd.st.setString(3,getEmail());
				bd.st.setString(4,getEndereco());
				bd.st.setString(5,getTelefone());
				bd.st.setString(6,getCpf());
				bd.st.setString(7,getCep());
				bd.st.setInt(8,getNumero());
				bd.st.setFloat(9,getSalario());
				bd.st.setString(10,getComplemento());


				bd.st.executeUpdate();//aqui � executado o comando de insert.
				return "Funcionario incluido com sucesso";
			}
			catch (SQLException erro){
				return "Falha na inclus�o"+erro.toString();
			}
			finally {//ele sempre passa aqui, mesmo depois do try ou do catch// finally � garante
				bd.Close();
			}
		}
		else {
			men="Falha na conex�o ao banco de dados.";
		}
		return men;
	}
	public String alterarFuncionario (){
		if (bd.getConnection()){
			try{
				sql="update funcionario set nome=?,cargo=?,email=?,endereco=?,telefone=?,cpf=?,cep=?,numero=?,salario=?,complemento=? where cod_funcionario=?";
				bd.st = bd.con.prepareStatement(sql);//st � uma classe que sabe executar fun��es em mysql
				bd.st.setString(1,getNome());
				bd.st.setString(2,getCargo());
				bd.st.setString(3,getEmail());
				bd.st.setString(4,getEndereco());
				bd.st.setString(5,getTelefone());
				bd.st.setString(6,getCpf());
				bd.st.setString(7,getCep());
				bd.st.setInt(8,getNumero());
				bd.st.setFloat(9,getSalario());
				bd.st.setString(10,getComplemento());
				bd.st.setInt(11,getCod_funcionario());
				
				int r = bd.st.executeUpdate();//aqui � executado o comando de insert.
				
				if (r==0){//r � o numero de linhas afetadas.
					return "Funcionario n�o encontrado";				
				}
				else {
					return "Funcionario alterado com sucesso";
				}

			}

			catch (SQLException erro){
				return "Falha na altera��o !!!"+erro.toString();
			}
			finally {//ele sempre passa aqui, mesmo depois do try ou do catch// finally � garante
				bd.Close();
			}

		}
		else {
			men="Falha na conex�o ao banco de dados.";
		}
		return men;
	}
	public Boolean procurarFuncionario (String codigo){
		/**
		 * localiza uma selecao apartir do codigo
		 */

		if (bd.getConnection()){
			try{

				sql = "select * from funcionario where cod_funcionario = ?";
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setInt(1, getCod_funcionario());
				bd.rs = bd.st.executeQuery();//rs � um objeto que contem linhas e colunas como no mysql

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
			System.out.println("Falha na conx�o.");
		}
		return false;
	}	
	public String excluirFuncionario (){
		if (bd.getConnection()){


			try{
				//definir a instru��o
				//criar a o acesso
				//identificar o que tem que ser feito
				//executar.
				sql="delete from funcionario where cod_funcionario=?";//esse comando vai apagar os registros com o id fornecido.
				bd.st = bd.con.prepareStatement(sql);//st � uma classe que sabe executar fun��es em mysql
				bd.st.setInt(1, getCod_funcionario());
				int r= bd.st.executeUpdate();
				if (r==0){//r � o numero de linhas afetadas.
					return "Fornecedor n�o encontrado";				
				}
				else {
					return "Fornecedor excluido com sucesso";
				}
			}
			catch (SQLException erro){
				return "Falha na exclus�o"+erro.toString();
			}
			finally {//ele sempre passa aqui, mesmo depois do try ou do catch// finally � garante
				bd.Close();
			}
		}
		else {
			men="Falha na conex�o ao banco de dados.";
		}
		return men;
	}

}
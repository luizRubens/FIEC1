package funcionario;

import java.sql.SQLException;

import GUIs.BD;

public class FuncionarioDAO extends Funcionario{
	
private BD bd;
	
	private String men="",sql="";

	public FuncionarioDAO() {
	
		bd=new BD();
		
	}
	
	public String inserirFuncionario(){
		if (bd.getConnection()){//para conectar com o banco, caso der errado ele vai pro else e vai dar erro

			try{
				sql="insert into funcionario (nome,CEP,bairro,endereco,cargo,salario,CPF,cidade) values(?,?,?,?,?,?,?,?)";
				bd.st = bd.con.prepareStatement(sql);//st é uma classe que sabe executar funções em mysql
				bd.st.setString(1,getNome());
				bd.st.setString(2,getCEP());
				bd.st.setString(3,getBairro());
				bd.st.setString(4,getEndereco());
				bd.st.setString(5,getCargo());
				bd.st.setInt(6,getSalario());
				bd.st.setString(7,getCPF());
				bd.st.setString(8, getCidade());
				bd.st.executeUpdate();//aqui é executado o comando de insert.
				return "Funcionario incluido com sucesso";
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
	
}
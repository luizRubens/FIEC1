package cliente;

import java.sql.SQLException;

import GUIs.BD;

public class ClienteDAO extends Cliente {

	private BD bd;
	
	private String men="",sql="";

	public ClienteDAO (){
		
		bd=new BD();
		
	}
	
	public String inserirCliente(){
		if (bd.getConnection()){//para conectar com o banco, caso der errado ele vai pro else e vai dar erro

			try{
				sql="insert into cliente (profissao,nome,endereco,CEP,CPF,bairro,cidade,UF,telefone) values(?,?,?,?,?,?,?,?,?)";
				bd.st = bd.con.prepareStatement(sql);//st é uma classe que sabe executar funções em mysql
				bd.st.setString(1,getProfissao());
				bd.st.setString(2,getNome());
				bd.st.setString(3,getEndereco());
				bd.st.setString(4,getCEP());
				bd.st.setString(5,getCPF());
				bd.st.setString(6,getBairro());
				bd.st.setString(7,getCidade());
				bd.st.setString(8, getUF());
				bd.st.setString(9,getTelefone());
				bd.st.executeUpdate();//aqui é executado o comando de insert.
				return "Cliente incluido com sucesso";
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

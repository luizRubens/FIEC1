package tipo_pacote;

import java.sql.SQLException;
import GUIs.BD;

public class Tipo_PacoteDAO extends Tipo_Pacote {

	private BD bd;

	private String men="",sql="";

	public Tipo_PacoteDAO (){

		bd=new BD();

	}

	public String inserirTipo_Pacote(){
		if (bd.getConnection()){//para conectar com o banco, caso der errado ele vai pro else e vai dar erro

			try{
				sql="insert into tipo_pacote (descricao) values(?)";
				bd.st = bd.con.prepareStatement(sql);//st é uma classe que sabe executar funções em mysql
				bd.st.setString(1,getDescricao());
				bd.st.executeUpdate();//aqui é executado o comando de insert.
				return "Tipo de pacote incluido com sucesso";
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

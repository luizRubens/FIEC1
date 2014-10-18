package view;

import java.sql.*;

public class BD {
	//para trabalhar com banco de dados nos vamos trabalhar com 3 clases diferentes

	public Connection con = null; // esse faz a conex�o com o banco
	public PreparedStatement st = null; // esse le o banco
	public ResultSet rs = null; //esse retorna

	private final String DRIVER = "com.mysql.jdbc.Driver"; //driver � uma constatnte e por isso esta em maiusculo
	//esse � o caminho ate o banco de dados
	private final String DATABASENAME = "si_tarde";
	private final String URL = "jdbc:mysql://localhost:3306/"+DATABASENAME;
	private final String LOGIN = "root";//usuario mysql padr�o
	private final String SENHA = "";

	/**
	 * realiza a conex�o ao banco de dados
	 * 	 * @return em caso de sucesso, ou false caso contrario
	 *  
	 */

	public boolean getConnection(){
		try{
			Class.forName (DRIVER);//carrega o driver
			con = DriverManager.getConnection(URL, LOGIN, SENHA);
			System.out.println("Conectando...");
			return true;
		}
		catch(ClassNotFoundException erro){
			System.out.println("Driver n�o localizado!");
			return false;
		}
		catch(SQLException erro){
			System.out.println("Falha na conex�o com o banco!"+erro.toString());
			return false;
		}
	}
	public void Close (){
		try{
			if (rs!=null) rs.close();
		}
		catch(SQLException erro) {}

		try {
			if (st!=null)st.close();
		}
		catch (SQLException erro){}

		try {
			if (con!=null)con.close();
			System.out.println("Desconectou");
		}
		catch (SQLException erro){}		
	}

	public static void main(String[] args) {//aqui so faz um teste pra ver se esta funcionando
		
		BD bd = new BD();//esta instanciando o objeto bd
		
		if (bd.getConnection()){
			//deu certo
			String sql = "select * from fornecedor";
			try {

				bd.st = bd.con.prepareStatement(sql);//bd.st � um atributo que esta dentro do objeto e essa instru��o sera executada
				bd.rs = bd.st.executeQuery();//rs vira uma tabela correspondente ao da tabela do banco de dados

				bd.Close();
			}
			catch (SQLException erro){
				System.out.println(erro.toString());
			}
		}
		else {
			System.out.println("Falha na conex�o.");
		}
	}
}
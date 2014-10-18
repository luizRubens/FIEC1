package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BD {
	//para trabalhar com banco de dados nos vamos trabalhar com 3 clases diferentes

	public Connection con = null; // esse faz a coneção com o banco
	public PreparedStatement st = null; // esse le o banco
	public ResultSet rs = null; //esse retorna

	private final String DRIVER = "com.mysql.jdbc.Driver"; //driver é uma constatnte e por isso esta em maiusculo
	//esse é o caminho ate o banco de dados
	private final String DATABASENAME = "si_tarde";
	private final String URL = "jdbc:mysql://localhost:3306/"+DATABASENAME;
	private final String LOGIN = "root";//usuario mysql padrão
	private final String SENHA = "";

	/**
	 * realiza a conexão ao banco de dados
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
			System.out.println("Driver não localizado!");
			return false;
		}
		catch(SQLException erro){
			System.out.println("Falha na conexão com o banco!"+erro.toString());
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

				bd.st = bd.con.prepareStatement(sql);//bd.st é um atributo que esta dentro do objeto e essa instrução sera executada
				bd.rs = bd.st.executeQuery();//rs vira uma tabela correspondente ao da tabela do banco de dados

				System.out.println("Relação de forneçedores: ");

				while (bd.rs.next()){
					//aqui eu preciso ler as colunas e as celulas
					//int id = bd.rs.getInt("id");
					String nome = bd.rs.getString("nome");
					String endereco = bd.rs.getString("endereco");
					String fone = bd.rs.getString("fone");
					String banco = bd.rs.getString("banco");
					String agencia = bd.rs.getString("agencia");
					String conta = bd.rs.getString("conta");
					System.out.println("["+nome+","+endereco+","+fone+","+banco+","+agencia+","+conta+"]");

				}
				bd.Close();
			}
			catch (SQLException erro){
				System.out.println(erro.toString());
			}
		}
		else {
			System.out.println("Falha na conexão.");
		}
	}
}
package banco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BDSQL {
	
	public Connection con = null;
	public PreparedStatement st = null;
	public ResultSet rs = null;
	private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private final String BANCO = "si_tarde";
	private final String URL = 	"jdbc:sqlserver://localhost:1433;databasename="+BANCO;
	private final String LOGIN = "sa";
	private final String SENHA = "123";
	
	public boolean getConnection(){
		try{
			Class.forName(DRIVER);
			con = DriverManager.getConnection(
				URL,LOGIN,SENHA);
			System.out.println("Conectou");
			return true;
		}
		catch(SQLException erro){
			System.out.println("Falha "+erro.toString());
			return false;
		}
		catch(ClassNotFoundException erro){
			System.out.println("Driver n�o encontrado!");
			return false;
		}
	}
	public void close(){
		try{
			if(rs!=null){ rs.close(); }
		}
		catch(SQLException erro){};

		try{
			if(st!=null){ st.close(); }
		}
		catch(SQLException erro){};
		
		try{
			if(con!=null){ 
				con.close();
				System.out.println("Desconectou");
			}
		}
		catch(SQLException erro){};
	}
	
	public static void main(String[] args) {
		BDSQL bd = new BDSQL();
		bd.getConnection();
		bd.close();
	}

}

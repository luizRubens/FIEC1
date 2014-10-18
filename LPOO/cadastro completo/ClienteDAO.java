package beans;
import java.sql.*;
public class ClienteDAO {
    public Cliente cliente;
    public BD bd;
    private String men, sql;
    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;

    public ClienteDAO() {
        bd = new BD();
        cliente = new Cliente();
    }

    public boolean localizar() {
        sql = "select * from clientes where codigo = ?";
        if(bd.getConnection()){
	        try{
	            bd.statement = bd.connection.prepareStatement(sql);
	            bd.statement.setString(1, cliente.getCodigo());
	            bd.resultSet = bd.statement.executeQuery();
	            bd.resultSet.first();
	            cliente.setCodigo(bd.resultSet.getString(1));
	            cliente.setNome(bd.resultSet.getString(2));
		        bd.close();
	            return true;
	        }
	        catch (SQLException erro) {
		        bd.close();
	            return false;
	        }
        }
        else
        	return false;
    }
    public String atualizar(int operacao) {
        men = "Operacao realizada com sucesso!";
        if(bd.getConnection()){
	        try{
	            if (operacao==INCLUSAO){
	                sql = "insert into clientes values (?,?)";
	                bd.statement = bd.connection.prepareStatement(sql);
	                bd.statement.setString(1, cliente.getCodigo());
	                bd.statement.setString(2, cliente.getNome());
	            }
	            else if (operacao==ALTERACAO){
	                sql = "update clientes set nome = ? where codigo = ?";
	                bd.statement = bd.connection.prepareStatement(sql);
	                bd.statement.setString(1, cliente.getNome());
	                bd.statement.setString(2, cliente.getCodigo());
	            }
	            else if (operacao==EXCLUSAO){
	                sql = "delete from clientes where codigo = ?";
	                bd.statement = bd.connection.prepareStatement(sql);
	                bd.statement.setString(1, cliente.getCodigo());
	            }
	            if (bd.statement.executeUpdate() == 0)
	                men = "Falha na operacao!";
	        }
	        catch (SQLException erro) {
	            men = "Falha na operacao " + erro.toString();
	        }
	        bd.close();
        }
        else
        	men = "Falha na conexão";
        
        return men;
    }
}

package banco;

import java.sql.*;

public class ClienteDAO {
	
    public Cliente cliente;
    public BDSQL bdsql;
    private String men, sql;
    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;

    public ClienteDAO() {
        bdsql = new BDSQL();
        cliente = new Cliente();
    }

    public boolean localizar() {
        sql = "select * from cliente where codigo = ?";
        if(bdsql.getConnection()){
	        try{
	        	bdsql.st = bdsql.con.prepareStatement(sql);
	        	bdsql.st.setString(1, cliente.getCodigo());
	        	bdsql.rs = bdsql.st.executeQuery();
	        	bdsql.rs.first();
	            cliente.setCodigo(bdsql.rs.getString(1));
	            cliente.setNome(bdsql.rs.getString(2));
	            bdsql.close();
	            return true;
	        }
	        catch (SQLException erro) {
	        	bdsql.close();
	            return false;
	        }
        }
        else
        	return false;
    }
    public String atualizar(int operacao) {
        men = "Operacao realizada com sucesso!";
        if(bdsql.getConnection()){
	        try{
	            if (operacao==INCLUSAO){
	                sql = "insert into cliente values (?,?)";
	                bdsql.st = bdsql.con.prepareStatement(sql);
	                bdsql.st.setString(1, cliente.getCodigo());
	                bdsql.st.setString(2, cliente.getNome());
	            }
	            else if (operacao==ALTERACAO){
	                sql = "update cliente set nome = ? where codigo = ?";
	                bdsql.st = bdsql.con.prepareStatement(sql);
	                bdsql.st.setString(1, cliente.getNome());
	                bdsql.st.setString(2, cliente.getCodigo());
	            }
	            else if (operacao==EXCLUSAO){
	                sql = "delete from cliente where codigo = ?";
	                bdsql.st = bdsql.con.prepareStatement(sql);
	                bdsql.st.setString(1, cliente.getCodigo());
	            }
	            if (bdsql.st.executeUpdate() == 0)
	                men = "Falha na operacao!";
	        }
	        catch (SQLException erro) {
	            men = "Falha na operacao " + erro.toString();
	        }
	        bdsql.close();
        }
        else
        	men = "Falha na conexão";
        
        return men;
    }
}

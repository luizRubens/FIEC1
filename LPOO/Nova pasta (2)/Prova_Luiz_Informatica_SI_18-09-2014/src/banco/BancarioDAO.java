package banco;

import java.sql.SQLException;

public class BancarioDAO extends Bancario {

	private BDSQL bdsql;
	private String ret = "", sql = "";

	public BancarioDAO() {
		// TODO Auto-generated constructor stub

		bdsql = new BDSQL();

	}

	public String inserir_Bancario() {
		if (bdsql.getConnection()) {

			try {
				sql = "insert into bancario (cliente,operacao,valor) values (?,?,?)";
				bdsql.st = bdsql.con.prepareStatement(sql);

				bdsql.st.setInt(1, getCliente());
				bdsql.st.setString(2, getOperacao());
				bdsql.st.setFloat(3, getValor());
				bdsql.st.executeUpdate();

				ret = "Registro incluído com sucesso";

			} catch (SQLException erro) {

				ret = "Falha na inclusão" + erro.toString();
			}

			finally {
				bdsql.close();
			}
		} else {
			ret = "Falha na conexão ao banco de dados.";
		}

		return ret;
	}

}

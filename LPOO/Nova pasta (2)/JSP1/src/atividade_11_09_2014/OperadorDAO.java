package atividade_11_09_2014;

import java.sql.SQLException;

public class OperadorDAO extends Operador {

	private BDSQL bdsql;
	private String sql = "";
	private String men = "";

	public OperadorDAO() {

		bdsql = new BDSQL();

	}

	public String inserir_Operador() {
		if (bdsql.getConnection()) {// para conectar com o banco, caso der
									// errado
									// ele vai pro else e vai dar erro

			try {
				sql = "insert into operador (num01,num02,operador) values(?,?,?)";
				bdsql.st = bdsql.con.prepareStatement(sql);
															
				bdsql.st.setString(1, getNum01());
				bdsql.st.setString(2, getNum02());
				bdsql.st.setString(3, getOperador());
				bdsql.st.executeUpdate();

			return	men = "Incluidos com sucesso";

			} catch (SQLException erro) {

				men = "Falha na inclusão" + erro.toString();

			}
		}
		return men;
	}
}

package login;

import java.sql.SQLException;

import sqlserver.BDSQL;

public class UsuarioDAO extends Usuario {

	private BDSQL bdsql;
	private String sql = "";

	String ret;

	public UsuarioDAO() {
		// TODO Auto-generated constructor stub
		bdsql = new BDSQL();

	}

	public boolean logar(String login, String senha) {
		sql = "select * from user_Login where usuario=? and senha=?";
		if (bdsql.getConnection()) {

			try {
				bdsql.st = bdsql.con.prepareStatement(sql);
				bdsql.st.setString(1, Criptografia.criptografar(login));
				bdsql.st.setString(2, Criptografia.criptografar(senha));
				bdsql.rs = bdsql.st.executeQuery();

				return bdsql.rs.next();

			} catch (SQLException e) {

				System.out.println(e.toString());

			} finally {
				bdsql.close();
			}

		}

		return false;
	}

	public boolean inserir() {

		if (bdsql.getConnection()) {

			try {
				sql = "insert into user_Login values(?,?)";
				bdsql.st = bdsql.con.prepareStatement(sql);

				bdsql.st.setString(1, Criptografia.criptografar(getLogin()));
				bdsql.st.setString(2, Criptografia.criptografar(getSenha()));
				int r = bdsql.st.executeUpdate();

				if (r == 1) {

					return true;

				}

			} catch (SQLException erro) {

				ret = "Falha na inclusão" + erro.toString();
			}

			finally {
				bdsql.close();
			}
		} else {
			ret = "Falha na conexão ao banco de dados.";
		}

		return false;

	}

	public boolean excluir() {

		if (bdsql.getConnection()) {

			try {
				sql = "delete from user_Login where usuario=?";
				bdsql.st = bdsql.con.prepareStatement(sql);

				bdsql.st.setString(1, Criptografia.criptografar(getLogin()));
				double r = bdsql.st.executeUpdate();

				if (r == 1) {

					return true;

				}

			} catch (SQLException erro) {

				ret = "Falha na inclusão" + erro.toString();
			}

			finally {
				bdsql.close();
			}
		} else {
			ret = "Falha na conexão ao banco de dados.";
		}

		return false;

	}
	// public String

}

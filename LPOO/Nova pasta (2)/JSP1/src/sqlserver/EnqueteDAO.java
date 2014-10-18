package sqlserver;

import java.sql.SQLException;

public class EnqueteDAO extends Enquete {

	private BDSQL bdsql;
	
	public EnqueteDAO() {
		bdsql = new BDSQL();
	}

	public boolean adicionarVoto(int id) {
		String sql_sel = "select * from enquete";
		String sql_up;
		try {
			bdsql.getConnection();
			bdsql.st = bdsql.con.prepareStatement(sql_sel);
			bdsql.rs = bdsql.st.executeQuery();
			bdsql.rs.next();

			// pega a quantidade de votos
			int voto1 = bdsql.rs.getInt(5);
			int voto2 = bdsql.rs.getInt(6);
			int voto3 = bdsql.rs.getInt(7);
			int voto4 = bdsql.rs.getInt(8);
			// atualizar a quantidade votos
			if (id == 1) {
				voto1++;
			}
			if (id == 2) {
				voto2++;
			}
			if (id == 3) {
				voto3++;
			}
			if (id == 4) {
				voto4++;
			}

			sql_up = "update  enquete set voto1=?,voto2=?,voto3=?,voto4=?  ";
			bdsql.st = bdsql.con.prepareStatement(sql_up);
			bdsql.st.setInt(1, voto1);
			bdsql.st.setInt(2, voto2);
			bdsql.st.setInt(3, voto3);
			bdsql.st.setInt(4, voto4);
			bdsql.st.executeUpdate();

			bdsql.close();
		} catch (SQLException err) {

			return false;
		}
		return true;
	}

}

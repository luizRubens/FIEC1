package view;

import java.sql.SQLException;

public class SelecaoDAO extends Selecao implements DAO {//Data Acess Object

	private String sql;

	private BD bd;//aqui foi declarado 

	public Boolean localizar (String codigo){
		/**
		 * localiza uma selecao apartir do codigo
		 */

		if (bd.getConnection()){
			try{

				sql = "select * from selecao where cod_selecao = ?";
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setInt(1, Integer.parseInt(codigo));
				bd.rs = bd.st.executeQuery();//rs é um objeto que contem linhas e colunas como no mysql

				if (bd.rs.next()){

					return true;//objeto atual
				}
			}
			catch (SQLException erro){

			}
			finally{
				bd.Close();
			}
		}
		else {
			System.out.println("Falha na conxão.");
		}
		return false;

	}

	public SelecaoDAO() {

		bd = new BD();//aqui foi instanciado o objeto

	}

	public String excluir() {

		if(localizar (getCod_selecao())){
			sql = "delete from selecao where cod_selecao = ?";
			if(bd.getConnection()){
				try{
					bd.st = bd.con.prepareStatement(sql);
					bd.st.setInt(1, Integer.parseInt(getCod_selecao()));
					bd.st.executeUpdate();//rs é um objeto que contem linhas e colunas como no mysql
					return "Seleção excluida com sucesso!";
				}

				catch (SQLException erro){
					return "Erro:"+erro.toString();

				}
				finally{
					bd.Close();
				}

			}

			else {
				System.out.println("Falha na conxão.");
			}

		}
		else{
			return "Seleção não localizada";
		}

		return null;
	}

	public String buscarNome(String codigo){
		if(bd.getConnection()){
			try{
				sql = "select nome from selecao where codigo=?";
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setString(1, codigo);
				bd.rs = bd.st.executeQuery();
				if(bd.rs.next()){
					return bd.rs.getString(1); 
				}
			}
			catch(SQLException erro){

			}
			finally{
				bd.Close();
			}

		}
		else{
			System.out.println("Falha na conexão");
		}
		return "";
	}

	public String gravar() {

		if (!localizar(getCod_selecao())){
			//inclusão
			sql = "insert into selecao (nome) values (?)";
			if (bd.getConnection()){
				try{
					bd.st = bd.con.prepareStatement(sql);
					bd.st.setString(1, getNome());//esse ? se refere ao ponto de ? do comando mysql acima, que se refere ao nome
					bd.st.executeUpdate();
					return "Seleção armazenada com sucesso";

				}
				catch(SQLException erro){
					return "Erro: "+erro.toString();

				}
				finally{
					bd.Close();
				}
			}
			else{
				return "Falha na conexão.";
			}
		}
		else{
			//atualização
			sql = "update selecao set nome = ? where cod_selecao = ?";

			if (bd.getConnection()){
				try{
					bd.st = bd.con.prepareStatement(sql);
					bd.st.setString(1, getNome());
					bd.st.setInt(2, Integer.parseInt(getCod_selecao()));//esse ? se refere ao ponto de ? do comando mysql acima, que se refere ao nome
					bd.st.executeUpdate();
					return "Seleção alterada com sucesso";
				}
				catch(SQLException erro){
					return "Erro: "+erro.toString();

				}
				finally{
					bd.Close();
				}
			}
			else{
				return "Falha na conexão.";
			}
		}
	}
}
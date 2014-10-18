package banco;

import java.sql.SQLException;

public class FornecedorDAO extends Fornecedor {

	private BD bd;
	private String men = "", sql = "";

	public FornecedorDAO() {
		bd = new BD();
	}

	public String inserir() {
		if (bd.getConnection()) {// para conectar com o banco, caso der errado
									// ele vai pro else e vai dar erro

			try {
				sql = "insert into fornecedor (nome,endereco,telefone,email,banco,agencia,conta) values(?,?,?,?,?,?,?)";
				bd.st = bd.con.prepareStatement(sql);// st � uma classe que sabe
														// executar fun��es em
														// mysql
				bd.st.setString(1, getNome());
				bd.st.setString(2, getEndereco());
				bd.st.setString(3, getTelefone());
				bd.st.setString(4, getEmail());
				bd.st.setString(5, getBanco());
				bd.st.setString(6, getAgencia());
				bd.st.setString(7, getConta());
				bd.st.executeUpdate();// aqui � executado o comando de insert.
				return "Fornecedor incluido com sucesso";
			} catch (SQLException erro) {
				return "Falha na inclus�o" + erro.toString();
			} finally {// ele sempre passa aqui, mesmo depois do try ou do
						// catch// finally � garante
				bd.Close();
			}
		} else {
			men = "Falha na conex�o ao banco de dados.";
		}
		return men;
	}

	public String alterar() {
		if (bd.getConnection()) {
			try {
				sql = "update fornecedor set nome=?,endereco=?,telefone=?,email=?,banco=?,agencia=?,conta=? where id=?";
				bd.st = bd.con.prepareStatement(sql);// st � uma classe que sabe
														// executar fun��es em
														// mysql
				bd.st.setString(1, getNome());
				bd.st.setString(2, getEndereco());
				bd.st.setString(3, getTelefone());
				bd.st.setString(4, getEmail());
				bd.st.setString(5, getBanco());
				bd.st.setString(6, getAgencia());
				bd.st.setString(7, getConta());
				bd.st.setInt(8, getId());
				int r = bd.st.executeUpdate();// aqui � executado o comando de
												// insert.
				if (r == 0) {// r � o numero de linhas afetadas.
					return "Fornecedor n�o encontrado";
				} else {
					return "Fornecedor alterado com sucesso";
				}

			}

			catch (SQLException erro) {
				return "Falha na altera��o !!!" + erro.toString();
			} finally {// ele sempre passa aqui, mesmo depois do try ou do
						// catch// finally � garante
				bd.Close();
			}

		} else {
			men = "Falha na conex�o ao banco de dados.";
		}
		return men;
	}

	public String excluir() {
		if (bd.getConnection()) {

			try {
				// definir a instru��o
				// criar a o acesso
				// identificar o que tem que ser feito
				// executar.
				sql = "delete from fornecedor where id=?";// esse comando vai
															// apagar os
															// registros com o
															// id fornecido.
				bd.st = bd.con.prepareStatement(sql);// st � uma classe que sabe
														// executar fun��es em
														// mysql
				bd.st.setInt(1, getId());
				int r = bd.st.executeUpdate();
				if (r == 0) {// r � o numero de linhas afetadas.
					return "Fornecedor n�o encontrado";
				} else {
					return "Fornecedor excluido com sucesso";
				}
			} catch (SQLException erro) {
				return "Falha na exclus�o" + erro.toString();
			} finally {// ele sempre passa aqui, mesmo depois do try ou do
						// catch// finally � garante
				bd.Close();
			}
		} else {
			men = "Falha na conex�o ao banco de dados.";
		}
		return men;
	}

}
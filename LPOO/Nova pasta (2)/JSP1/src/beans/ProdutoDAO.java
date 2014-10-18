package beans;

import java.sql.SQLException;

public class ProdutoDAO extends Produto {

	private BD bd;
	private String ret = "", sql = "";

	public ProdutoDAO() {

		bd = new BD();// aqui é criado o objeto bd que acessa ao banco de
						// dados.

	}

	public String inserir() {
		if (bd.getConnection()) {// para conectar com o banco, caso der errado
									// ele vai pro else e vai dar erro

			try {
				sql = "insert into produto (descricao,preco) values(?,?)";
				bd.st = bd.con.prepareStatement(sql);// st é uma classe que sabe
														// executar funções em
														// mysql
				bd.st.setString(1, getDescricao());
				bd.st.setFloat(2, getPreco());
				bd.st.executeUpdate();// aqui é executado o comando de insert.
				ret = "Produto incluido com sucesso";
				
			} catch (SQLException erro) {

				ret = "Falha na inclusão" + erro.toString();

				if (ret.indexOf("Duplicate") >= 0) {

					ret = "Produto já cadastrado.";

				}
			}

			finally {// ele sempre passa aqui, mesmo depois do try ou do catch//
						// finally é garante
				bd.Close();
			}
		} else {
			ret = "Falha na conexão ao banco de dados.";
		}
		return ret;
	}

	public String Excluir() {
		if (bd.getConnection()) {

			try {
				// definir a instrução
				// criar a o acesso
				// identificar o que tem que ser feito
				// executar.
				sql = "delete from produto where cod_produto=?";// esse comando
																// vai apagar os
																// registros com
																// o id
																// fornecido.
				bd.st = bd.con.prepareStatement(sql);// st é uma classe que sabe
														// executar funções em
														// mysql
				bd.st.setInt(1, getCod_produto());
				int r = bd.st.executeUpdate();

				if (r > 0) {// r é o numero de linhas afetadas.
					ret = "Produto excluído com sucesso." + getCod_produto();
				} else {
					ret = "Produto não encontrado.";
				}
			} catch (SQLException erro) {
				ret = "Erro SQL " + erro.toString();
			} finally {// ele sempre passa aqui, mesmo depois do try ou do
						// catch// finally é garante
				bd.Close();
			}
		} else {
			ret = "Falha na conexão ao banco de dados.";
		}
		return ret;
	}

	public String Alterar() {
		if (bd.getConnection()) {
			try {
				sql = "update produto set descricao=?, preco=? where cod_produto=?";
				bd.st = bd.con.prepareStatement(sql);// st é uma classe que sabe
														// executar funções em
														// mysql
				bd.st.setString(1, getDescricao());
				bd.st.setFloat(2, getPreco());
				bd.st.setInt(3, getCod_produto());

				int r = bd.st.executeUpdate();// aqui é executado o comando de
												// insert.

				if (r > 0) {// r é o numero de linhas afetadas.
					ret = "Produto alterado com sucesso.";
				} else {
					ret = "Codigo do produto não localizado.";
				}
			}

			catch (SQLException erro) {
				ret = "Falha na alteração !!!" + erro.toString();
			} finally {// ele sempre passa aqui, mesmo depois do try ou do
						// catch
				// finally é garante
				bd.Close();
			}

		} else {
			ret = "Falha na conexão ao banco de dados.";
		}
		return ret;
	}

	public Boolean Localizar() {
		return null;

	}
}
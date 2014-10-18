package beans;

import java.sql.SQLException;

public class Produto {

	private BD bd;
	int ret;
	private String sql = "";

	private String descricao;
	private int cod_produto;
	private float preco;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCod_produto() {
		return cod_produto;
	}

	public void setCod_produto(int cod_produto) {
		this.cod_produto = cod_produto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int inserir100() {

		int n =0;
		bd = new BD();

		if (bd.getConnection()) {// para conectar com o banco, caso der errado
			// ele vai pro else e vai dar erro

			try {
				sql = "insert into produto (descricao,preco) values(?,?)";
				bd.st = bd.con.prepareStatement(sql);// st é uma classe que sabe
				// executar funções em
				// mysql

				for (int i=1;i<=100;i++){
					bd.st.setString(1, "Produto "+i);
					bd.st.setFloat(2,i);
					bd.st.executeUpdate();// aqui é executado o comando de insert.
					n++;
				}
			} catch (SQLException erro) {

			}
		
		finally {// ele sempre passa aqui, mesmo depois do try ou do catch//
			// finally é garante
			bd.Close();
		}
	}
	return ret;
}

}

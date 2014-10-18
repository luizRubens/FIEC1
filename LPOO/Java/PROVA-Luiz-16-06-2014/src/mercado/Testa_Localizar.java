package mercado;

import java.sql.SQLException;

public class Testa_Localizar{

	public static void main(String[] args) {

		BD bd = new BD();//esta instanciando o objeto bd
		if (bd.getConnection()){
			//deu certo
			String sql = "select * from compra";
			try {

				bd.st = bd.con.prepareStatement(sql);//bd.st é um atributo que esta dentro do objeto e essa instrução sera executada
				bd.rs = bd.st.executeQuery();//rs vira uma tabela correspondente ao da tabela do banco de dados

				System.out.println("Compras:");

				while (bd.rs.next()){
					//aqui eu preciso ler as colunas e as celulas

					int cod_compra = bd.rs.getInt("cod_compra");
					int quantidade = bd.rs.getInt("quantidade");
					float preco_unitario = bd.rs.getFloat("preco_unitario");
					float valor_total = bd.rs.getFloat ("valor_total");
					String descricao = bd.rs.getString("descricao");
					System.out.println("["+cod_compra+","+quantidade+","+preco_unitario+","+valor_total+"]");

				}
				bd.Close();
			}
			catch (SQLException erro){
				System.out.println(erro.toString());
			}
		}
		else {
			System.out.println("Falha na conexão.");
		}

	}		
}

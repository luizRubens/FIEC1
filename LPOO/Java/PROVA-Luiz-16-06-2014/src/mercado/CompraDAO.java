package mercado;

import java.sql.SQLException;

public class CompraDAO extends Compra{

	private BD bd;

	private String men="",sql="";

	public CompraDAO() {

		bd=new BD();

	}

	public String inserirCompra(){
		if (bd.getConnection()){//para conectar com o banco, caso der errado ele vai pro else e vai dar erro

			try{
				sql="insert into compra (descricao,preco_unitario,quantidade,valor_total) values(?,?,?,?)";
				bd.st = bd.con.prepareStatement(sql);//st é uma classe que sabe executar funções em mysql
				bd.st.setString(1,getDescricao());
				bd.st.setFloat(2,getPreco_unitario());
				bd.st.setInt(3,getQuantidade());
				bd.st.setFloat(4,getValor_total());
				bd.st.executeUpdate();//aqui é executado o comando de insert.
				return "Compra incluida com sucesso";
			}
			catch (SQLException erro){
				return "Falha na inclusão"+erro.toString();
			}
			finally {//ele sempre passa aqui, mesmo depois do try ou do catch// finally é garante
				bd.Close();
			}
		}
		else {
			men="Falha na conexão ao banco de dados.";
		}
		return men;
	}
	public Boolean localizarPorCodigo (String codigo){
		/**
		 * localiza uma selecao apartir do codigo
		 */

		if (bd.getConnection()){
			try{

				sql = "select * from compra where cod_compra = ?";
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
			System.out.println("Não localizado.");
		}
		return false;

	}
	

	public String buscarPorCodigo (int cod_compra){
		if(bd.getConnection()){
			try{
				sql = "select * from selecao where cod_compra=?";
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setInt(1, cod_compra);
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

}
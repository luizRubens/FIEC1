package mercado;

public class Compra {

	private int cod_compra, quantidade;
	private float preco_unitario,valor_total;
	private String descricao;
	
	public int getCod_compra() {
		return cod_compra;
	}
	public void setCod_compra(int cod_compra) {
		this.cod_compra = cod_compra;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getPreco_unitario() {
		return preco_unitario;
	}
	public void setPreco_unitario(float preco_unitario) {
		this.preco_unitario = preco_unitario;
	}
	public float getValor_total() {
		return valor_total;
	}
	public void setValor_total(float valor_total) {
		this.valor_total = valor_total;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}

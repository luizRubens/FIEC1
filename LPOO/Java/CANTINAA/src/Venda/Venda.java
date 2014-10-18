package Venda;

public class Venda {

	private int cod_venda,cod_funcionario,cod_produto,quantidade;

	private String periodo,data_venda;
	private float valor_total;

	public int getCod_venda() {
		return cod_venda;
	}
	public void setCod_venda(int cod_venda) {
		this.cod_venda = cod_venda;
	}
	public int getCod_funcionario() {
		return cod_funcionario;
	}
	public void setCod_funcionario(int cod_funcionario) {
		this.cod_funcionario = cod_funcionario;
	}
	public int getCod_produto() {
		return cod_produto;
	}
	public void setCod_produto(int cod_produto) {
		this.cod_produto = cod_produto;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getData_venda() {
		return data_venda;
	}
	public void setData_venda(String data_venda) {
		this.data_venda = data_venda;
	}
	public float getValor_total() {
		return valor_total;
	}
	public void setValor_total(float valor_total) {
		this.valor_total = valor_total;
	}

	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}

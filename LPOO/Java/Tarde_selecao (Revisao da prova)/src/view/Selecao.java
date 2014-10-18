package view;

public class Selecao {

	private String cod_selecao;
	private String nome;

	public String getCod_selecao() {
		return cod_selecao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Selecao(String cod_selecao, String nome) {
		
		this.cod_selecao = cod_selecao;
		this.nome = nome;
	}
	public void setCod_selecao(String cod_selecao) {
		this.cod_selecao = cod_selecao;
	}
	public Selecao() {
		
	}
	public String toString(){
		return cod_selecao+","+nome;
	}
}

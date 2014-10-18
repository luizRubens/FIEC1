package exercicio01;


public class Livro {

	private int codigo;
	private String titulo;
	private String editora;
	private double preco;
	private int ano;

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {

		if (codigo>=1){
			this.codigo = codigo;
		}
		else{
			JOptionPane.showMessageDialog(null, "Codigo invalido!");
		}
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {

		if(preco>=1){

			this.preco = preco;

		}
		else{

			JOptionPane.showMessageDialog(null, "O preço não pode ser menor que 0.");

		}
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		
		if(ano<1919){
			
			JOptionPane.showMessageDialog(null, "O ano não pode ser maior do que 1920");
			
		}
		else if(ano>2021){
			JOptionPane.showMessageDialog(null, "O ano não pode ser amor do que 2020.");
		}
				
		this.ano = ano;
	}

	public Livro(int codigo,	 String titulo,	 String editora,	 double preco,	 int ano){		
	}
	
	public Livro (int codigo, String titulo){

	}
}

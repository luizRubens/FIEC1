package oo;
import javax.swing.JOptionPane;

// feito dia 10/02/2014
public class Pincel {
	// uma classe sempre tem atributos e metodos
	// classe vai ser um modelo, um molde usado para criar objetos
	//come�aremos com os atributos
	public String cor;
	// String permite que nos armazenamos somente texto
	//String � uma classe que pois metodos dentro dels pra serem usados
	public int comprimento;
	// int s� guarda valores inteiros
	public double pre�o;
	//double s� guarda valores inteiros 

	// agora metodos
	/**
	 * abre a tampa do pincel
	 */
	public void abrir (){
		System.out.println("Abrindo a tampa do pincel!");
	}
	//void � alguma coisa que n�o tem retorno
	/**
	 * fecha a tampa do pincel
	 */
	public void fechar (){
		System.out.println ("Fechando a tampa do pincel!");
	}
	/**
	 * escreve com o pincel
	 */
	public void escrever (){
		System.out.println("Escrevendo com o pincel");
	}


}

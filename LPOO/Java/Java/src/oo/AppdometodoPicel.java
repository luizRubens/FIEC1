package oo;

public class AppdometodoPicel {
	//10/02/2014
	public static void main(String[] args) {
		//letra maiuscula classe, letra minuscula objeto
		//a classe Picel vai reservar um espa�o na memoria RAM para guardar os objetos pincel1, picel2
		Pincel pincel1,pincel2;

		pincel1 = new Pincel();//tirei c�pia
		pincel2 = new Pincel();// new � um compilador para cria (instaciar) um objeto 

		pincel1.cor="vermelho";
		pincel2.cor="azul";
		pincel1.comprimento=100;
		pincel1.pre�o=2.45;
		pincel2.cor="azul";
		pincel2.comprimento=100;
		pincel2.pre�o=2.68;
		//sintaxe:objeto.atributo ou objeto.m�todo

		pincel1.abrir();
		pincel1.escrever();
		pincel1.fechar();

		System.out.println(pincel1.getClass());//getClass mostra quem � a m�e dele
		System.out.println(pincel2.hashCode());//hashCode mostra o numero do objeto que cada objeto recebe como se fosse um "nome"
		System.out.println(pincel1.equals(pincel2));
		System.out.println(pincel1.toString());


	}

}

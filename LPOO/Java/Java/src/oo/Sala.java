//dia 10/02/2014
package oo;
public class Sala {
	Lampada l1 = new Lampada();
	Lampada l2 = new Lampada();
	Lampada l3 = new Lampada();
	Lampada l4 = new Lampada();
	public void ligarTodasLampadas (){
		l1.ligar ();
		l2.ligar ();
		l3.ligar ();
		l4.ligar ();
	}
	public void desligarTodasLampadas (){
		l1.desligar ();
		l1.desligar ();
		l1.desligar ();
		l1.desligar ();
	}
	public void ligarL1 (){
		l1.ligar();
	}
	public void ligarL2 (){
		l2.ligar();
	}
	public void ligarL3 (){
		l3.ligar();
	}
	public void ligarL4 (){
		l4.ligar();
	}
	public void desligarL1 (){
		l1.desligar();
	}
	public void desligarL2 (){
		l2.desligar();
	}
	public void desligarL3 (){
		l3.desligar();
	}
	public void desligarL4 (){
		l4.desligar();
	}
	public void mostrarEstado (){


		if (l1.status==true){
			System.out.println("Lampada 1: ligada");
		}
		else{ System.out.println ("Lampada 3: desligada");
		}
		if (l1.status==true){
			System.out.println("Lampada 1: ligada");
		}
		else{ System.out.println ("Lampada 1: desligada");
		}
		if (l2.status==true){
			System.out.println("Lampada 2: ligada");
		}
		else{ System.out.println ("Lampada 2: desligada");
		}
		if (l3.status==true){
			System.out.println("Lampada 3: ligada");
		}
		else{ System.out.println ("Lampada 3: desligada");
		}
		if (l4.status==true){
			System.out.println("Lampada 4: ligada");
		}
		else{ System.out.println ("Lampada 4: desligada");
		}
	}
}
package progressao;
import java.util.Random;
import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
		Random ran = new Random();  

		String[] letras ={"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};  
		String b = "";  

		System.out.print("Digite o numero de caracteres para sua senha: ");  
		int num = scan.nextInt();  

		for ( int i = 0; i < num; i++){  
			int a = ran.nextInt(letras.length);  
			b += letras[a];  
		}  

		System.out.print("Senha gerada: " + b);  
	}  
  
}



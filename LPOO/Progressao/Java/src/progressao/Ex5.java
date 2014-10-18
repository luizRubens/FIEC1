package progressao;

public class Ex5 {

	public static void main(String[] args) {
		int n=0;	
		int a = 0;	

		for (a=0;a<1000;a++){
			if (a%2==0){
				n=n+a;
			}
		}
		System.out.println("A soma é: "+n);
	}
}
package progressao;

import javax.swing.JOptionPane;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;          
		String U[];       
		String d[];       
		String c[];       
		String conv;      

		U = new String[21];   
		d = new String[11];   
		c = new String[11];   

		U[0] = "Zero";  
		U[1] = "Um";  
		U[2] = "Dois";  
		U[3] = "Tr�s";  
		U[4] = "Quatro";  
		U[5] = "Cinco";  
		U[6] = "Seis";  
		U[7] = "Sete";  
		U[8] = "Oito";  
		U[9] = "Nove";  
		U[10] = "Dez";  
		U[11] = "Onze";  
		U[12] = "Doze";  
		U[13] = "Treze";  
		U[14] = "Quatorze";  
		U[15] = "Quinze";  
		U[16] = "Dezesseis";  
		U[17] = "Dezessete";  
		U[18] = "Dezoito";  
		U[19] = "Dezenove";  

		d[2] = "Vinte";   
		d[3] = "Trinta";  
		d[4] = "Quarenta";  
		d[5] = "Cinquenta";  
		d[6] = "Sessenta";  
		d[7] = "Setenta";  
		d[8] = "Oitenta";  
		d[9] = "Noventa";  

		c[1] = "Cento";  
		c[2] = "Duzentos";  
		c[3] = "Trezentos";  
		c[4] = "Quatrocentos";  
		c[5] = "Quinhentos";  
		c[6] = "Seiscentos";  
		c[7] = "Setecentos";  
		c[8] = "Oitocentos";  
		c[9] = "Novecentos";  
		c[10]= "Mil";  

		conv = JOptionPane.showInputDialog("Digite um numero entre 1 e 100");  
		num = Integer.parseInt(conv);    
		if(num>100){
			JOptionPane.showMessageDialog(null,"Escreva um numero entre Um e Cem");
		}
		else{

			if (num ==1000){   
				JOptionPane.showMessageDialog(null,"O numero digitado foi: " + c[10]);   
			}  

			if (num > 1000){ 
				JOptionPane.showMessageDialog(null,"O numero digitado n�o � inv�lido");  
			}           
			if (num<=19){  
				JOptionPane.showMessageDialog(null,"O numero digitado foi: " + U[num]);  
			}   
			if (num > 19 && num < 100){   
				int dez = Integer.parseInt(conv.substring(0,1));   
				int uni = Integer.parseInt(conv.substring(1,2));  
				if (uni == 0){  
					JOptionPane.showMessageDialog(null,"O numero digitado foi: " + d[dez]);   
				} 
				else {   
					JOptionPane.showMessageDialog(null,"O numero digitado foi: " + d[dez] + " e " + U[uni]);  
				}  
			}  

			if (num >99 && num < 1000){  
				int cen = Integer.parseInt(conv.substring(0,1));  
				int dez = Integer.parseInt(conv.substring(1,2));  
				int uni = Integer.parseInt(conv.substring(2,3));  
				if (cen ==1 && dez == 0 && uni == 0)  
				{ c[1]= "Cem";  
				JOptionPane.showMessageDialog(null,"O numero digitado foi: " + c[cen]);  
				} else  
					if (dez == 0 && uni ==0){  
						JOptionPane.showMessageDialog(null,"O numero digitado foi: " + c[cen]);  
					} else  
						if (dez ==0){  
							JOptionPane.showMessageDialog(null,"O numero digitado foi: " + c[cen] + " e " + U[uni]);  
						} else  
							if (uni == 0){  
								JOptionPane.showMessageDialog(null,"O numero digitado foi: " + c[cen] + " e " + d[dez]);  
							} else   
								if (dez ==1){  
									int dezeuni = Integer.parseInt(conv.substring(1,3));    
									JOptionPane.showMessageDialog(null,"O numero digitado foi: " + c[cen] + " e " + U[dezeuni]);        
								}  
								else { 
									JOptionPane.showMessageDialog(null,"O numero digitado foi: " + c[cen] + " e " + d[dez]+ " e " + U[uni]);  

								}
			}  
		}  
	}

}
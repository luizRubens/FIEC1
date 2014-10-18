//exercicio
//elabore a classe Aluno contendo os seguintes atributos privados e seus metodos get/set correspondentes:
//atributos: RA, nome, idade, sexo, calouro
package visibilidade;

import javax.swing.JOptionPane;

public class Aluno {
	
	public String Ra;
	public String Nome;
	public int Idade;
	public char Sexo;
	public boolean Calouro;
	
	public String getRa() {
		return Ra;
	}
	public void setRa(String ra) {
		Ra = ra;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
		if(Idade>=0 && Idade<=120){
		
		}
		else{
			JOptionPane.showMessageDialog(null,"Idade invalida!");
		}
	}
	public char getSexo() {
		return Sexo;
	}
	public void setSexo(char sexo) {
		Sexo = sexo;
		if (sexo=='M'||sexo=='F'||sexo=='m'||sexo=='f'){

		}
		else{
			System.out.println("Sexo invalido! Forneça M ou F.");
		}
	}
	public boolean isCalouro() {
		return Calouro;
	}
	public void setCalouro(boolean calouro) {
		Calouro = calouro;
	}

}

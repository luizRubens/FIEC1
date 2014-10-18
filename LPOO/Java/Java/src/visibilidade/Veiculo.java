package visibilidade;

import javax.swing.JOptionPane;
import com.mysql.jdbc.StringUtils;

//get pegar o valor
//set define o valor
// package, public e private são modificadores.
public class Veiculo {

	public StringUtils fabricante;

	private int anoFabricacao;

	public void guardarAno (int ano) {

		if(ano>=1900 && ano<=2020){//aqui o if vai testar se o ano de fabricacao esta dea cordo com a area
			anoFabricacao = ano;//essa é a maneira de acessar um metodo privado em uima classe puplica
		}

		else{
			JOptionPane.showMessageDialog(null,"Ano invalido!");
		}
	}

	public int retornarAno(){//porque o ano é um numero int

		return anoFabricacao;

	}
}

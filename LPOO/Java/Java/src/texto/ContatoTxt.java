package texto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ContatoTxt extends Contato {

	public String gravar (){
		String ret = "Gravado com sucesso.";
		//a estrutura que trata erros na gravação dos disco é o try catch.
		try {
			PrintWriter pw = new PrintWriter (getNome());//essa linha cria o arquivo no disco
			
			pw.println(getNome());//imprime o arquivo no disco
			pw.println(getFone());
			pw.println(getEmail());
			
			pw.flush();//força na memoria para o disco, é uma grantia que o que ta na memoria ram vai ser gravada no disco
			pw.close();//fecha o arquivo 

		}
		catch (IOException erro){
			ret = "Erro"+erro.toString();
		}
		return ret;
	}
	public Contato ler (){
		try{
			//abre o arquivo para a leitura
			BufferedReader br = new BufferedReader (new FileReader (getNome()+".txt"));//serve para ler o arquivo
			
			setNome(br.readLine());
			setFone (br.readLine());//lê linha
			setEmail(br.readLine());
			br.close();
			return this;//objeto que esta sendo usado
		}
		catch (IOException erro){
			return null;//não encontrou arquivo
		}
	}
}
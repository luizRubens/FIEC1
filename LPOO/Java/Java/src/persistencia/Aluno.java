package persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno implements Serializable {

	public String ra, nome, curso, email;
	/**
	 * grava o estado oficila do objeto 
	 * @return retorna true em caso de sucesso, ou false em caso contrario
	 */

	public boolean gravar (){
		FileOutputStream f= null;
		ObjectOutputStream obj = null;
		try{
			f= new FileOutputStream(ra);
			obj = new ObjectOutputStream(f);
			obj.writeObject(this);//this é o objeto que vc vai gravar que aqui é o aluno
			obj.flush();//cria um fluxo entre a memoria e o disco e grava no disco
			return true;

		}
		catch (IOException erro) {
			System.out.println(erro.toString());
			return false;
		}
		finally{
			try{

				f.close ();
				obj.close ();}
			catch (IOException e){

			}		
		}	
	}

	/**
	 * Realiza a leitura de um aluno a partir do nome do arquivo
	 * @param ra: caminha e nome do arquiuvo a ser lido
	 * @return: um objeto do tipo aluno
	 */
	public Aluno ler (String ra){
		FileInputStream f= null;
		ObjectInputStream obj = null;
		try{
			f= new FileInputStream(ra);
			obj = new ObjectInputStream(f);
			return (Aluno) obj.readObject ();//aqui ele converte um objeto para o aluno 

		}
		catch (Exception erro) {
			System.out.println(erro.toString());
			return null;//aqui retorna nulo se não conseguiu ler
		}
		finally{
			try{

				f.close ();
				obj.close ();}
			catch (IOException e){

			}
		}
	}
}
package login;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {

		UsuarioDAO u = new UsuarioDAO();

		String login, senha;

		login = "luiz.carlos";
		senha = "123456";

		u.setLogin(login);
		u.setSenha(senha);

		JOptionPane.showMessageDialog(null, u.inserir());

	}
}
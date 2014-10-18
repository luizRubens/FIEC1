package login;

public class Usuario {

	private String login, senha;

	public String getLogin() {
		return login;
	}

	public boolean setLogin(String login) {
		if (login.length() >= 6) {
			this.login = login;
			return true;

		}
		return false;

	}

	public String getSenha() {
		return senha;
	}

	public boolean setSenha(String senha) {
		if (senha.length() >= 6) {
			this.senha = senha;
			return true;

		}
		return false;

	}

}

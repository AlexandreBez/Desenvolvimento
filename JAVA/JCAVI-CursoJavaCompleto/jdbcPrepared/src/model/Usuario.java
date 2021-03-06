package model;

import java.io.Serializable;

public class Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6654786250553828018L;
	

	private String nome;
	private String email;
	private String login;
	private String senha;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", email=" + email + ", login=" + login + ", senha=" + senha + "]";
	}

	
}
package br.com.bytebank.banco.modelo;

public interface Autenticavel {

	void setSenha(int senha);

	public boolean autenticavel(int senha);

}

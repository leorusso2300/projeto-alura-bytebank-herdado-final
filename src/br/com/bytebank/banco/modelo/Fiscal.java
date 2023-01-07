package br.com.bytebank.banco.modelo;

public class Fiscal implements Autenticavel {

	private AutenticacaoUtil util;

	public Fiscal() {
		this.util = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
	}

	@Override
	public boolean autenticavel(int senha) {
		return this.util.autenticavel(senha);
	}

}

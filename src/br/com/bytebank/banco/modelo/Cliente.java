package br.com.bytebank.banco.modelo;

public class Cliente implements Autenticavel {

	private AutenticacaoUtil util;

	public Cliente() {
		this.util = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
	}

	@Override
	public boolean autenticavel(int senha) {
		return util.autenticavel(senha);
	}

}

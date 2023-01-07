package br.com.bytebank.banco.modelo;

public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil util;

	public Gerente() {
		this.util = new AutenticacaoUtil();
	}

	@Override
	public double getbonificacao() {
		return super.getSalario() + 200;
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

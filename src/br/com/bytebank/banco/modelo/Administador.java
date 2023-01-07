package br.com.bytebank.banco.modelo;

public class Administador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil util;

	public Administador() {
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

	@Override
	public double getbonificacao() {
		return super.salario + (super.salario * 0.20);
	}

}

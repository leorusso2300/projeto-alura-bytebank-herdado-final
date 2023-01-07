package br.com.bytebank.banco.modelo;

public class ControleBonificacao {

	private int totalBonificacao;

	public void registra(Funcionario funcionario) {
		double soma = funcionario.getbonificacao();
		totalBonificacao += soma;
	}

	public int getTotalBonificacao() {
		return totalBonificacao;
	}

}

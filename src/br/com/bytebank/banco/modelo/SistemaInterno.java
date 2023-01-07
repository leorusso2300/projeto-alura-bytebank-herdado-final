package br.com.bytebank.banco.modelo;

public class SistemaInterno {

	private int senha = 1234;

	public void autentica(Autenticavel auth) {

		boolean autenticou = auth.autenticavel(this.senha);

		if (autenticou) {
			System.out.println("Autenticou!");
		} else {
			System.out.println("Não autenticou!");
		}
	}
}

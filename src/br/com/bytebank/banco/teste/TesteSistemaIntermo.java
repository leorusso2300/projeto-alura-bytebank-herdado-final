package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Fiscal;
import br.com.bytebank.banco.modelo.Gerente;
import br.com.bytebank.banco.modelo.SistemaInterno;

public class TesteSistemaIntermo {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		Cliente cliente = new Cliente();
		Fiscal fiscal = new Fiscal();

		gerente.setSenha(1234);
		cliente.setSenha(1234);
		fiscal.setSenha(1234);

		SistemaInterno sys = new SistemaInterno();
		sys.autentica(gerente);
		sys.autentica(cliente);
		sys.autentica(fiscal);

	}

}

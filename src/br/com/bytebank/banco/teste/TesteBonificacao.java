package br.com.bytebank.banco.teste;

import java.text.NumberFormat;
import java.util.Locale;

import br.com.bytebank.banco.modelo.Administador;
import br.com.bytebank.banco.modelo.ControleBonificacao;
import br.com.bytebank.banco.modelo.Designer;
import br.com.bytebank.banco.modelo.EditorVideo;
import br.com.bytebank.banco.modelo.Gerente;

public class TesteBonificacao {

	public static void main(String[] args) {

		Locale localeBR = new Locale("pt", "BR");
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

		EditorVideo video = new EditorVideo();
		Gerente gerente = new Gerente();
		Administador adm = new Administador();
		Designer designer = new Designer();

		gerente.setSalario(1000);
		video.setSalario(1000);
		adm.setSalario(1000);
		designer.setSalario(1000);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(video);
		controle.registra(gerente);
		controle.registra(adm);
		controle.registra(designer);

		System.out.println("Soma das bonificações: " + dinheiro.format(controle.getTotalBonificacao()));

	}

}

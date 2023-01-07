package br.com.bytebank.banco.modelo;

public class EditorVideo extends Funcionario {

	@Override
	public double getbonificacao() {
		return (super.salario * 0.10) + super.salario;
	}

}

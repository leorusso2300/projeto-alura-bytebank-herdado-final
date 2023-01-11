package br.com.bytebank.banco.modelo;

import br.com.bytebank.banco.exceptions.MinhaExcecao;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	protected double salario;

	public abstract double getbonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario <= 0) {
			throw new MinhaExcecao("Insira um valor valido!!");
		}
		this.salario = salario;
	}

}

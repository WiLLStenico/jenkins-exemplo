package br.com.caelum.blog.jenkins;
public class Orcamento {

	private double valor;

	public Orcamento(double valor) {
		this.valor = valor + 1;
	}

	public double getValor() {
		return valor;
	}

}

package br.com.caelum.blog.jenkins;

public class Imposto {

	public Imposto() {
	}

	public double calcula(Orcamento orcamento) {
		System.out.println("teste");
		System.out.println("piu piu");
		return orcamento.getValor() * 0.1;
	}

}
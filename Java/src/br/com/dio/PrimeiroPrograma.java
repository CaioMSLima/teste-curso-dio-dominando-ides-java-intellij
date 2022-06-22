package br.com.dio;

import br.com.dio.model.hiena;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		hiena hiena = new hiena();
		Livros livros = new Livros();
		
		System.out.println(hiena);
		
		/*int a = 3;
		int b = 8;
		System.out.println("Hello Word " + (a + b));*/

	}

}

class Livros {
	private String nome;
	private String npag;
}
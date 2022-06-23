package br.com.dio;

import br.com.dio.model.Hiena;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Hiena hiena = new Hiena();

        System.out.println(hiena);

        String nome = "O problema dos 3 corpos";
        Livros livros = new Livros(nome, 300);
        System.out.println(livros);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello word! " + (a+b) );*/
    }
}

class Livros {
    private String nome;
    private Integer numPagina;

    public Livros(String nome, Integer numPagina) {
        this.nome = nome;
        this.numPagina = numPagina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(Integer numPagina) {
        this.numPagina = numPagina;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", numPagina=" + numPagina +
                '}';
    }



}


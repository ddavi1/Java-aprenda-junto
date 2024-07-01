package aula05;

public class Carro {

    // ATRIBUTOS
    String nome; // fusca
    String marca;
    String cor;
    int ano;

    public Carro(String nome, String marca, String cor, int ano) {

        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }

    public void imprimirDados() {

        System.out.println("Nome do carro: " + this.nome);
        System.out.println("Marca do carro: " + this.marca);
        System.out.println("Cor do carro : " + this.cor);
        System.out.println("Ano do carro: " + this.ano);
    }


    public String acelerar() {

        return "acelerei";
    }

}

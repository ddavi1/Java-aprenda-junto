package aula07;

public class Pessoa {

    // ATRIBUTOS

    private String nome;
    private String sobreNome;
    private int idade;
    private String telefone;

    public Pessoa(String nome, String sobreNome,  int idade, String telefone) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.telefone = telefone;

    }

    public void imprimirDados() {
        System.out.format("nome: %s %s\n" , this.nome, getSobreNome());
        System.out.println("idade: " + this.idade);
        System.out.println("telefone: " + this.telefone);
    }


    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

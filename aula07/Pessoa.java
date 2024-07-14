package aula07;

public class Pessoa {

    // ATRIBUTOS

    private String nome;
    private String sobreNome;
    private int idade;
    private String telefone;

    private String rg;

    public Pessoa(String nome, String sobreNome,  int idade, String telefone, String rg) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.telefone = telefone;
        this.rg = rg;

    }

    public void imprimirDados() {
        System.out.format("nome: %s %s\n" , this.nome, getSobreNome());
        System.out.println("idade: " + this.idade);
        System.out.println("telefone: " + this.telefone);
        System.out.println("RG: " + this.rg);
    }


    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

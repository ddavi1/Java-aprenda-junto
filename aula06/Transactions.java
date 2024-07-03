package aula06;

public class Transactions {
    // ATRIBUTOS

    private String nome;
    private double saldo;
    private String cpf;


    public Transactions(String nome, double saldo, String cpf) {
        this.nome = nome;
        this.saldo = saldo;
        this.cpf = cpf;
    }

    public void imprimirDados() {

        System.out.println("nome do titular: " + this.nome);
        System.out.println("saldo da conta: " + this.saldo);
        System.out.println("cpf do titular: " + this.cpf);
    }

    public void depositar(double saldo) {

        System.out.println("voce depositou: " + saldo);
        this.saldo += saldo;

    }

    public void retirar(double saldo) {

       if (saldo > this.saldo ) {
           throw new RuntimeException("so pode retirar oque você tem na conta!");
       } else {
           System.out.println("retirou: " + saldo);
           this.saldo -= saldo;
       }

    }

    //GETTER E SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {

        if (cpf.length() < 11) {
            throw new RuntimeException("cpf não pode ser alterado pois não atinge os requisitos");
        } else {
            this.cpf = cpf;
        }

    }
}

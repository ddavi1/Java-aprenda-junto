package aula07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu primeiro nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu segundo nome: ");
        String sobreNome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite seu telefone: ");
        String telefone = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, sobreNome, idade, telefone);

        pessoa.imprimirDados();
    }
}

package aula07;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = null;

        imprimirDados();

        int opcao = scanner.nextInt();
        scanner.nextLine();

        while (opcao !=0) {

            if (opcao == 1) {

                System.out.println("Digite seu primeiro nome: ");
                String nome = scanner.nextLine();

                System.out.println("Digite seu segundo nome: ");
                String sobreNome = scanner.nextLine();

                System.out.println("Digite sua idade: ");
                int idade = scanner.nextInt();

                scanner.nextLine();

                System.out.println("Digite seu telefone: ");
                String telefone = scanner.nextLine();

                pessoa = new Pessoa(nome, sobreNome, idade, telefone);
            } else if (opcao == 2) {
                pessoa.imprimirDados();

            }

            imprimirDados();

            opcao = scanner.nextInt();
            scanner.nextLine();


        }
        System.out.println("programa finalizado\n");
    }

    private static void imprimirDados() {
        System.out.println("Escolha uma opção");
        System.out.println("1 - Cadastro de pessoas");
        System.out.println("2 - Visualizar pessoa cadastrada");
        System.out.println("3 - Apagar");
        System.out.println("0 - Sair");
    }
}
package aula07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao = mostraMenuEDevolveOpcaoSelecionada(scanner);

        List<Pessoa> pessoasList = new ArrayList<>();
        
        while (opcao !=0) {

            if (opcao == 1) {
                imprimirSeparador();

                System.out.println("Digite seu primeiro nome: ");
                String nome = scanner.nextLine();

                System.out.println("Digite seu segundo nome: ");
                String sobreNome = scanner.nextLine();

                System.out.println("Digite sua idade: ");
                int idade = scanner.nextInt();

                scanner.nextLine();

                System.out.println("Digite seu telefone: ");
                String telefone = scanner.nextLine();

                imprimirSeparador();

                Pessoa pessoa = new Pessoa(nome, sobreNome, idade, telefone);
                pessoasList.add(pessoa); //

            } else if (opcao == 2) {

                    if(pessoasList.isEmpty()) {
                        System.out.println("Não existe nenhuma pessoa no sistema");
                    } else {
                        for (Pessoa pessoa: pessoasList) {
                            imprimirSeparador();
                            pessoa.imprimirDados();
                        }

                    }

            } else if (opcao == 3) {
                pessoasList.clear(); // limpa a lista
                System.out.println("Pessoa apagada com sucesso!");
            }

            opcao = mostraMenuEDevolveOpcaoSelecionada(scanner);

        }

    }

    private static int mostraMenuEDevolveOpcaoSelecionada(Scanner scanner) {
        imprimirMenu();
        int opcao = scanner.nextInt();
        scanner.nextLine();
        return opcao;
    }

    private static void imprimirSeparador() {
        System.out.println("==================================================================================================");

    }

    private static void imprimirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastro de pessoas");
        System.out.println("2 - Visualizar pessoa cadastrada");
        System.out.println("3 - Apagar");
        System.out.println("0 - Sair");
    }
}
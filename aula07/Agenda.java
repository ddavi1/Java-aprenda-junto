package aula07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

    private final Scanner scanner;

    private final List<Pessoa> pessoasCadastradas = new ArrayList<>();

    public Agenda(Scanner scanner) {
        this.scanner = scanner;
    }




    public void executa() {

        OpcaoMenu opcao = mostraMenuEDevolveOpcaoSelecionada();


        while (opcao != OpcaoMenu.SAIR) { // 0


            switch (opcao) {
                case OpcaoMenu.CADASTRO: // case 1
                    imprimirMenu();
                    Pessoa pessoa = cadastroDePessoas();
                    pessoasCadastradas.add(pessoa);
                    break;


                case OpcaoMenu.VISUALIZACAO: // 2
                    exibePessoas();
                    imprimirMenu();
                    break;


                case OpcaoMenu.APAGAR: // 9
                    apagaPessoa();
                    imprimirMenu();
                    break;

                default:
                    System.out.println("Opção invalida");
            }

            opcao = mostraMenuEDevolveOpcaoSelecionada();

        }

    }


    private void imprimirSeparador() {
        System.out.println("==================================================================================================");

    }

    private void imprimirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastro de pessoas");
        System.out.println("2 - Visualizar pessoa cadastrada");
        System.out.println("9 - Apagar");
        System.out.println("0 - Sair");
    }

    private OpcaoMenu mostraMenuEDevolveOpcaoSelecionada() {
        imprimirMenu();
        int opcao = scanner.nextInt();
        scanner.nextLine();
        return OpcaoMenu.getFromCodigo(opcao);
    }

    private Pessoa cadastroDePessoas() {
        System.out.println("Digite seu primeiro nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu segundo nome: ");
        String sobreNome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite seu telefone: ");
        String telefone = scanner.nextLine();

        System.out.println("Digite seu RG: ");
        String rg = scanner.nextLine();


        imprimirSeparador();

        return new Pessoa(nome, sobreNome, idade, telefone, rg);

    }

    private void exibePessoas() {

        if(pessoasCadastradas.isEmpty()) {
            System.out.println("Não existe nenhuma pessoa no sistema");
        } else {
            for (Pessoa pessoa: pessoasCadastradas) {
                imprimirSeparador();
                pessoa.imprimirDados();
            }

        }
    }

    private void apagaPessoa() {
        System.out.println("Digite o RG da pessoa a ser excluida: ");
        String rg = scanner.nextLine();


        int tempIndex = -1;
        for(int i = 0; i < pessoasCadastradas.size(); i++) {
            Pessoa pessoa = pessoasCadastradas.get(i);

            if(pessoa.getRg().equals(rg)) {
                tempIndex = i;
            }
        }

        imprimirSeparador();

        if(tempIndex != -1) {
            pessoasCadastradas.remove(tempIndex);
            System.out.println("Pessoa apagada com sucesso");
        } else {
            System.out.println("Rg não encontrado");
        }

        imprimirSeparador();
    }


}

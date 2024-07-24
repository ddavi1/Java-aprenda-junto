package aula15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;


        System.out.println("Escolha uma opção abaixo");
        System.out.println("1 - coca");
        System.out.println("2 - pizza");

        opcao = scanner.nextInt();


        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a coca");
                break;


            case 2:
                System.out.println("Voce escolheu pizza");
                break;

            default:
                System.out.println("Não existe está opção");
                break;
        }




//        List<Pessoa> pessoaList = new ArrayList<>();
//        pessoaList.add(new Pessoa("davi", 20));
//        pessoaList.add(new Pessoa("maria", 40));


        // FOREACH
//        for (Pessoa pessoa : pessoaList) {
//            System.out.println(pessoa.nome);
//            System.out.println(pessoa.idade);
//        }


//        int i = 0;
//
//        for (; i< pessoaList.size(); i++) {
//            System.out.println(pessoaList.get(i).nome);
//            System.out.println(pessoaList.get(i).idade);
//
//
//        }
//
//        System.out.println("tamano de i: " + i);




//        System.out.println(p1.nome);
//        System.out.println(p1.idade);
//
//
//
//        Pessoa[] pessoasArray = new Pessoa[2];
//
//        pessoasArray[0] = p1;
//        pessoasArray[1] = p2;
//
//        System.out.println(pessoasArray[0]);


//        byte numPequeno = 1;
//        Long numMenor = 1L;
//        int num = 10;
//        float numPonto = 12.67f;
//        double numPonto2 = 13.644f;
//        String nome = "davi";
//        char letra = 'a';
//        boolean valorVF= true;


        // IF-ELSE // ELSE-IF

//        int idade;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite um numero: ");
//        idade = scanner.nextInt();
//
//        if(idade>=18) {
//            System.out.println("MAIOR ou IGUAL a 18 anos");
//        } else if (idade == 17) {
//            System.out.println("Idade digitada foi: " + idade);
//        } else {
//            System.out.println("MENOR que 18 anos");
//        }
//


//        // WHILE
//
//        int contador= 0;
//
//        while (contador <=10) {
//            System.out.println("Mariana conta: " + contador);
//            contador++;
//
//        }

            // DO WHILE


//            int contador= 0;
//
//            do{
//                System.out.println("Mariana conta: " + contador);
//                contador++;
//
//            } while(contador == 1);





    }
}

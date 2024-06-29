package aula04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);



        System.out.println("Qual sua idade: ");
        int idade = scanner.nextInt();

        // SISTEMA DE VOTAÇÃO
        // VOTA QUEM TEM 18 OU QUEM É EMANCIPADO
        // EMANCIPADO = ENTRE 16 E 17 ANOS

        if (idade>=18 && idade <=130) {
            System.out.println("voce pode votar!");

        } else if(idade == 16 || idade == 17) {
            System.out.println("voce pode votar, pois é emancipado");

        } else if(idade <16) {
        System.out.println("voce nao pode votar, pois é muito novo!");

        } else {
            System.out.println("idade invalida!");
        }

    }
}

package aula07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Agenda agenda = new Agenda(scanner);

        agenda.executa();

    }


}
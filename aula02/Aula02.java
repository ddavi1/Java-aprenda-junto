package aula02;

public class Aula02 {


    public static void main(String[] args) {
        
        // byte = armazena de -128 até 127 (%d)
        byte pequeno = -128;

        // short = armazena entre -32768 até 32767 (%d)
        short quasePequeno = 32767;

        // int = armazena entre -2147483648 até 2147483647 (%d)
        int quaseGrande = -2147483648;

        // long (necessita do L no final) = armazena entre 922337203685477000 (tanto Positivo quanto Negativo) (%d)
        long grandao = 922337203685477000L;

        // float (necessita do f no final) (%f)
        float numeroComVirgula = 32.767f;

        // double (letra no final opcional) suporta um numero maior de casas decimais (ele é mais preciso) (%f)
        double numeroComVirgula2 = 32.767;

        // aspas simples (%c)
        char letra = 'd';

        //aspas duplas (%s)
        String nome = "davi";

        // ele armazena true ou false (%b)
        Boolean logic = true;

        System.out.format("byte: %d\nshort: %d\nint: %d\nlong: %d\nfloat: %.3f\ndouble: %.3f\nchar: %c\nString: %s\nboolean: %b\n",
                pequeno, quasePequeno, quaseGrande, grandao, numeroComVirgula, numeroComVirgula2, letra, nome, logic);
        
    }
}





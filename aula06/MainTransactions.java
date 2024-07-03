package aula06;

public class MainTransactions {

    public static void main(String[] args) {

        Transactions transactions = new Transactions("davi", 500, "999.999.999-01");
        
        transactions.setNome("david");
        transactions.setCpf("22");

        System.out.println(transactions.getNome());

        transactions.imprimirDados();



    }
}

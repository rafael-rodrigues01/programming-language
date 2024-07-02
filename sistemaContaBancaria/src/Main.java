public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(56, "Caina Antunes Silva");


        if(c1.depositar(100)) {
            System.out.println("Depósito realizado com sucesso!");
        } else  {
            System.out.println("valor inválido!");
        }
        System.out.println(c1.getSaldo());

        if(c1.sacar(13.40)) {
            System.out.println("Saque realizado com sucesso!");
        } else  {
            System.out.println("valor inválido!");
        }

        System.out.println(c1.getSaldo());

        ContaBancaria c2 = new ContaBancaria(8888, "Andre");
        System.out.println(c2);

        System.out.println(c1);

    }
}
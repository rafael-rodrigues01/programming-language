
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Rafael");
        System.out.println(conta1.toString());
        conta1.depositar(100);
        System.out.println("Saldo:" + conta1.getSaldo());
        conta1.sacar(101);
        System.out.println(conta1.toString());
        System.out.println("Saldo:" + conta1.getSaldo());
        System.out.println("Titular: " + conta1.getTitular());

        ContaBancaria conta2 = new ContaBancaria("Jesus");
        System.out.println(conta2.toString());
    }
}
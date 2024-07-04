public class ContaBancaria {
    //atributos
    private static int numero;
    private double saldo;
    private String titular;

    //constructors
    public ContaBancaria(String titular) {
        this.numero += 1;
        this.saldo = 0;
        this.titular = titular;
    }

    //metodos
    public  void depositar (double value) {
        if(value <= 0) {
            System.out.println("Valor deve ser positivo maior que 0");
            return;
        }

        this.saldo += value;
        System.out.println("Valor de " + value + " depositado com sucesso!");
    }

    public void sacar(double value) {
        if(!(value > 0)) {
            System.out.println("Valor deve ser positivo maior que 0");
            return;
        }

        if(saldo > 0 && value <= saldo) {
            this.saldo -= value;
            System.out.println("Saque Realizado com sucesso!");
        } else {
            System.out.println("saldo insuficiente");
        }
    }

    //getters and setters
    public double getSaldo () {return saldo;}
    public String getTitular () {return  titular;}

    //toString

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }
}

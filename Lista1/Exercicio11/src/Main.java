import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Entrar com o valor de temperatura em graus Celsius e exibir a temperatura correspondente em graus Fahrenheit.

        double celsius, fahrenheit;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor em graus Celsius:");
        celsius = in.nextDouble();

        fahrenheit = celsius * 1.8 + 32;

        System.out.println(celsius + " graus Celsius equivale a " + fahrenheit + " graus Fahrenheit");
    }
}
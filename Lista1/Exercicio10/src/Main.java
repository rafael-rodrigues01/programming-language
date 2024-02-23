import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ler uma medida de distância em milhas e converter para quilômetros.

        double quilometros, milhas;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor em milhas:");
        milhas = in.nextDouble();

        quilometros = milhas * 1.609;

        System.out.println(milhas + " milhas equivale a " + quilometros + " quilômetros");
    }
}
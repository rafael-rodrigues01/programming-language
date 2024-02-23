import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ler uma medida de distância em quilômetros e converter para milhas.

        double quilometros, milhas;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor em km:");
        quilometros = in.nextDouble();

        milhas = quilometros / 1.609;

        System.out.println(quilometros + " quilômetro equivale a " + milhas + " milhas");
    }
}
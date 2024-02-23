import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ler uma medida em milímetro e converter para polegadas.

        double polegadas, milimetro;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor em milimetro:");
        milimetro = in.nextDouble();

        polegadas = milimetro / 25.4;

        System.out.println(milimetro + " milimetro equivale a " + polegadas + " polegadas");

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ler uma medida em polegadas e converter para milímetros.

        double polegadas, milimetro;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor em polegada:");
        polegadas = in.nextDouble();

        milimetro = polegadas * 25.4;

        System.out.println(polegadas + " polegada equivale a " + milimetro + " milimetro");

    }
}
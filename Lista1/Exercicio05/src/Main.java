import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ler uma velocidade em Km/h e converter para m/s.

        double km, ms;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma velocidade em Km/h:");
        km = in.nextDouble();

        ms = km * 1000 / 3600;

        System.out.println(km + " km/h equivale a " + ms + " m/s por segundo");
    }
}
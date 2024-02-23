import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ler uma velocidade em m/s e converter para km/h.

        double km, ms;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma velocidade em m/s:");
        ms = in.nextDouble();

        km = ms * 3.6;

        System.out.println(ms + " m/s equivale a " + km + " km/h por hora");


    }
}
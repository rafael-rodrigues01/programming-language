import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Receber o raio e um círculo e calcular sua área.

        double ray, result;

        double pi = Math.PI;

        System.out.println(pi);

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o raio de um circulo:");
        ray = in.nextDouble();

        result = Math.pow(ray, 2) * pi;

        System.out.println("A área é: " + result + " cm²");

        in.close();
    }
}
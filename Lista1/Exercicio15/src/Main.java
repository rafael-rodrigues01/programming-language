import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Receber o raio e a altura de um cilindro e calcular seu volume.

        double ray, height, volume;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a area de um cilindro:");
        ray = in.nextDouble();

        System.out.println("Digite a altura de um cilindro:");
        height = in.nextDouble();

        volume= (Math.PI * Math.pow(ray, 2)) * height;

        System.out.println("Volume =" + volume);

        in.close();
    }
}
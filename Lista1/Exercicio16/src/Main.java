import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Receber o raio e a altura de um cone e calcular seu volume.

        double ray, height, volume;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a area de um cone:");
        ray = in.nextDouble();

        System.out.println("Digite a altura de um cone:");
        height = in.nextDouble();

        volume= ((Math.PI * Math.pow(ray, 2)) * height) / 3;

        System.out.println("Volume =" + volume);

        in.close();
    }
}
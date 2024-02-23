import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Receber a base e a altura de um triângulo retângulo e calcular sua área.

        double base, height, areaOfTriangle;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a base de um triângulo:");
        base = in.nextDouble();

        System.out.println("Digite a altura de um triângulo:");
        height = in.nextDouble();

        areaOfTriangle = (base * height) / 2;

        System.out.println("A área de um triângulo retângulo é: " + areaOfTriangle + " cm²");

        in.close();
    }
}
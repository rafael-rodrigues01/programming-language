import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ler duas notas N1 e N2 e exibir a média.

        double N1, N2, result;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        N1 = in.nextDouble();
        System.out.println("Digite outra nota: ");
        N2 = in.nextDouble();

        result = (N1 + N2) / 2;

        System.out.println("A média das duas notas é: " + result);
    }
}
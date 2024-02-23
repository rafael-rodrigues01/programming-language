import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ler duas notas N1 e N2 e exibir a média. Obs.: N1 tem peso 1 e N2 tem peso 2. Obs.: O resultado deve estar entre 0 e 10.

        double n1, n2, media, result1, result2;

        int pesoN1 = 1;
        int pesoN2 = 2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma nota:");
        n1 = in.nextDouble();

        System.out.println("Digite outra nota:");
        n2 = in.nextDouble();

        result1 = n1 * pesoN1;
        result2 = n2 * pesoN2;

        double sumOfResults = result1 + result2;

        media = sumOfResults / (pesoN1 + pesoN2);

        System.out.println("A média é: " + media);
    }
}
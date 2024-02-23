import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        18.Receber os coeficientes a e b de uma equação do primeiro grau e imprimir a solução.
        Equação do primeiro grau: ax + b = 0
         */

        int a, b, x;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o coeficiente a:");
        a = in.nextInt();

        System.out.println("Digite o coeficiente b:");
        b = in.nextInt();

        x = -b/a;

        System.out.println(a + "X + (" + b + ") = 0, então x=" +x);

        in.close();
    }
}
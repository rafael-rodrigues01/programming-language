import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Receber os coeficientes a, b e c de uma equação do segundo grau e imprimir a solução.
        Equação do segundo grau: ax2 + bx + c = 0
         */

        double a, b, c, delta, x1, x2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o coeficiente a:");
        a = in.nextDouble();

        System.out.println("Digite o coeficiente b:");
        b = in.nextDouble();

        System.out.println("Digite o coeficiente b:");
        c = in.nextDouble();

        delta = Math.pow(b, 2) -4 * a * c;

        x1 = (-b + Math.sqrt(delta))/(2*a);
        x2 = (-b - Math.sqrt(delta))/(2*a);

        System.out.println(a + "X^2 + (" + b + ")X + ("+c+") = 0, \n Então \n x1="+ x1 +" e x2=" +x2);

        in.close();
    }
}
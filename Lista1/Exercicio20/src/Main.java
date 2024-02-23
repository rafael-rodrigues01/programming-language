import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
           20.Descobrir uma equação do segundo grau a partir de suas raízes:
            x1 = 1 e x2 = 2
            Então:
            (x -1) . (x -2)
            Logo:
            x
            2
            -3x -2 = 0
        */

        double x1, x2, b, c;

        Scanner in = new Scanner(System.in);

        System.out.println("X1:");
        x1 = in.nextDouble();

        System.out.println("X2:");
        x2 = in.nextDouble();

        b = -(x1+x2);
        c = x1*x2;

        System.out.println("x² + (" + b + ")x +(" +c+ ") = 0");

        in.close();
    }
}
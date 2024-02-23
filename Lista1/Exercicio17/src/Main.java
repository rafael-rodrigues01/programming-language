import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
            Receber velocidade inicial, aceleração e tempo de percurso de um corpo e calcular sua
            velocidade.
         */

        double v0, t, a, vf;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a velocidade inicial:");
        v0 = in.nextDouble();

        System.out.println("Digite o tempo:");
        t = in.nextDouble();

        System.out.println("Digite o aceleração:");
        a = in.nextDouble();

        vf = v0 + a * t;

        System.out.println("Velocidade final =" + vf);

        in.close();
    }
}
/*
  3. Entrar com a nota 1 (n1) e nota 2 (n2) e o programa exibe na tela a média. Se a média
  for menor que 50 imprimir “Reprovado” caso contrário imprimir “Aprovado”
 */

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    double n1, n2, media;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        n1 = in.nextDouble();

        System.out.println("Digite a segunda nota:");
        n2 = in.nextDouble();

        media = (n1 + n2) / 2;

        System.out.println("A média é: " + media);

        if (media < 50) {
            System.out.println("Reprovado.");
            in.close();
            return;
        }

        System.out.println("Aprovado.");
        in.close();
    }
}

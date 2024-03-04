/*
Calcule o fatorial de um número determinado pelo usuário usando for.
 */

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    double number, result;

    Scanner in = new Scanner(System.in);

    System.out.println("Digite um número:");
    number = in.nextDouble();

    result = 1;

    for (int i = 1; i <= number; i++) {
      result *= i;
    }

    System.out.println("Fatorial de " + number + " = " + result);

    in.close();
  }
}

/*
8. Criar um programa onde o usuário entra com um número e o programa diz se o número digitado é primo ou não
 */

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    int number;

    Scanner in = new Scanner(System.in);

    System.out.println("Digite um número:");
    number = in.nextInt();

    int count = 0;

    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        if (number % number == 0) {
          count++;
        }
      }
    }

    if (count == 2) {
      System.out.println("O número " + number + " é primo.");
      in.close();
      return;
    }

    System.out.println("O número " + number + " não é primo.");

    in.close();

  }
}
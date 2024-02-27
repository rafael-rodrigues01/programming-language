/*
10. Receber três números inteiros e exibi-los em ordem crescente.
 */

import java.util.Arrays;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    int number1, number2, number3;

    Scanner in = new Scanner(System.in);

    System.out.println("Digite o primeiro número inteiro:");
    number1 = in.nextInt();

    System.out.println("Digite o segundo número inteiro:");
    number2 = in.nextInt();

    System.out.println("Digite o terceiro número inteiro:");
    number3 = in.nextInt();

    int [] numbers = {number1, number2, number3};

    Arrays.sort(numbers);

    System.out.println();

    System.out.println("Números em ordem crescente: \n");

    for (int i : numbers) {
      System.out.println(i);
    }

    in.close();

  }
}

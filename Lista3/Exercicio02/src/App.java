/*
 * Criar um programa que receba 5 números inteiros digitados pelo usuário e ao final exibao maior e o menor números digitados (Obs.: Apenas o maior e o menor número devemser armazenados).
 */

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    int number;
    int bigger = 0;
    int smaller = 1000000000;
    int i = 1;

    Scanner in = new Scanner(System.in);
    
    do {
      System.out.println("Digite o " + i + " número inteiro:");
      number = in.nextInt();

      if (number > bigger) {
        bigger = number;
      }

      if (number < smaller) {
        smaller = number;
      }
      i++;
    } while (i != 6);

    System.out.println("\n" + "Maior número: " + bigger);
    System.out.println("Menor número: " + smaller);
    
    in.close();
  }
}
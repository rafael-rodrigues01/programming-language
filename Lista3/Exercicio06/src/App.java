/*
6. Peça para o usuário inserir dois números inteiros e exiba todos os números existentes
entre os números digitados.
 */

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    int number1, number2;

    Scanner in = new Scanner(System.in);

    System.out.println("\nDigite um número inteiro:");
    number1 = in.nextInt();

    System.out.println("\nDigite o segundo número inteiro:");
    number2 = in.nextInt();

    System.out.println("\nNúmeros do intervalo:");

    if(number1 > number2) {
      int aux = number1;
      number1 = number2;
      number2 = aux;
    }

    for (int i=number1+1; i<number2; i++){
      System.out.println(i);
    }

    in.close();
  }
}

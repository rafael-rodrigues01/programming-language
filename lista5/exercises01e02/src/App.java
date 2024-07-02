
/*
 * 1. Escreva uma função que receba um número inteiro positivo N e retorne a
 * soma de todosos números inteiros de 1 até N. Obs.: N deve ser maior que 0.
 */

 /*
  * 2. Implemente uma função para calcular o fatorial de um número inteiro N digitado pelousuário.
  */

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.println("Soma = " + somar(receber()));
    System.out.println("Fatorial " + "!= " + fatorial(receber()));
  }

  static int receber() {
    Scanner in = new Scanner(System.in);

    int n;

    do {
      System.out.println("Digite um numero maior que 0:");
      n = in.nextInt();
    } while (n <= 0);

    return n;
  }

  static int somar(int n) {
    int soma = 0;

    for (int i = 1; i <= n; i++) {
      soma += i;
    }
    return soma;
  }

  static int fatorial (int n) {
    int resultado = 1;

    for (int i = n; i > 1; i--) {
      resultado *= i;
    }
    return resultado;
  }

}

/*
  6. Em um sistemas de caixa eletrônico o usuário deve escolher entre as opções de um menu escolhendo um número inteiro entre 5 e 9 inclusive. Crie um algoritmo que validea entrada do usuário exibindo a opções escolhida ou a mensagem de opção inválida casoo usuário entre com um número fora do range estabelecido
 */

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    double number;

    Scanner in = new Scanner(System.in);

    System.out.println("Digite um número inteiro entre 6 e 9:");
    number = in.nextDouble();

    if (number >= 5 && number <= 9) {
      System.out.println("O número digitado é: " + number);
      in.close();
      return;
    }

    System.out.println("Número inválido!");

  }
}

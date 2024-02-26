
/*
 5. Elabore um programa que calcule a média de um aluno e imprima o conceito:• A se a média >= 8.5• B se a média >= 7 e média < 8.5• C se a média >= 5 e média < 7• D se a média < 5
 */

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    double media;

    Scanner in = new Scanner(System.in);

    System.out.println("Digite a media do aluno:");
    media = in.nextDouble();

    if (media >= 8.5) {
      System.out.println("conceito: A");
      in.close();
      return;
    }

    if (media >= 7 && media < 8.5) {
      System.out.println("conceito: B");
      in.close();
      return;
    }

    if (media >= 5 && media < 7) {
      System.out.println("conceito: C");
      in.close();
      return;
    }

    if (media < 5) {
      System.out.println("conceito: D");
      in.close();
      return;
    }

  }
}


/*
10. Escreva um programa que gere a sequência de Fibonacci até o enésimo termo, onde né um número fornecido pelo usuário. Na matemática, a sucessão de Fibonacci, é umasequência de números inteiros, começando normalmente por 0 e 1, na qual cada termosubsequente corresponde à soma dos dois anteriores.
• Exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 897, 1597..
 */

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    int number, f1, f2, f3, f4;
    Scanner in = new Scanner(System.in);

    System.out.println("Digite um número:");
    number = in.nextInt();

    f1 = 1;
    f2 = 2;

    for (int i = 0; i < 10; i++) {
      f3 = f1 + f2;
      f4 = f2 + f3;
    }

    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f3);
    System.out.println(f4);

  }
}
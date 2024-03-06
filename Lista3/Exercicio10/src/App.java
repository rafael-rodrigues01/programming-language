
/*
10. Escreva um programa que gere a sequência de Fibonacci até o enésimo termo, onde né um número fornecido pelo usuário. Na matemática, a sucessão de Fibonacci, é umasequência de números inteiros, começando normalmente por 0 e 1, na qual cada termosubsequente corresponde à soma dos dois anteriores.• Exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 897, 1597...
 */

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    int number, aux;
    int a = 0;
    int b = 1;

    Scanner in = new Scanner(System.in);

    System.out.println("\nDigite um número para a seguência de fibonacci:");
    number = in.nextInt();

    for (int i = 0; i < number; i++) {
      aux = b;
      b = a + b;
      a = aux;
      System.out.println(a);
    }

    in.close();
  }
}

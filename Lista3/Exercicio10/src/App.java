
/*
10. Escreva um programa que gere a sequência de Fibonacci até o enésimo termo, onde né um número fornecido pelo usuário. Na matemática, a sucessão de Fibonacci, é umasequência de números inteiros, começando normalmente por 0 e 1, na qual cada termosubsequente corresponde à soma dos dois anteriores.• Exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 897, 1597...
 */

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    int n, n1, n2, aux;
    n1 = 0;
    n2 = 1;
    System.out.println("Digite o limite esperado para a sequencia de Fibonacci: ");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    System.out.println(0);

    while (n2 < n) {
      System.out.println(n2);
      aux = n1;
      n1 = n2;
      n2 = aux + n2;
    }
    in.close();
  }
}

/*
3. Criar um algoritmo que exiba todos os números positivos divisíveis por 4 e menores que 200.
 */

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    int i = 1;

    Scanner in = new Scanner(System.in);

    while (i < 200) {
      if (i % 4 == 0) {
        System.out.println(i);
      }
      i++;
    }

    in.close();
  }
}

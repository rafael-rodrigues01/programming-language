/*
2. Declare e inicialize um vetor de 10 posições, em seguida percorra este vetor alterandoseus valores conforme a seguinte regra: some 2 a todos os valores situados em posiçõescom índice par e para as posições de índice ímpar multiplique seu valores por 2.
*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
  public static void main(String[] args) throws Exception {
    int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] % 2 == 0) {
        vetor[i] += 2;
      } else {
        vetor[i] *= 2;
      }
    }

    System.out.println(Arrays.toString(vetor));
  }
}
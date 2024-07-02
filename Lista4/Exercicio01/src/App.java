/*
 * 1. Declare e inicialize um vetor de 10 posições, em seguida imprima este vetor em ordeminversa.
 */

public class App {
  public static void main(String[] args) throws Exception {
    int myVetor[] = new int[10];

    System.out.println(myVetor.length);

    for (int i = myVetor.length -1; i >= 0; i--) {
      myVetor[i] = i;
      System.out.println(" " + myVetor[i]);
    }
  }
}

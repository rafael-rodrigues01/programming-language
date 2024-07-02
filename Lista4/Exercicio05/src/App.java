
/*
5. Crie um programa que possua um vetor de 10 posições com os seguintes valores inteirosarmazenados: int [] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; quando executado o programa devecriar uma cópia “invertida” em um segundo vetor e em seguida exibir ambos os vetores
*/

public class App {
  public static void main(String[] args) throws Exception {
    int [] vector = {10,20,30,40,50, 60,70,80,90};
    int [] rotcev = new int[vector.length];
    
    for(int i=0;i< vector.length;i++){
        rotcev[(vector.length-1)-i]=vector[i];
    }
    for (int n: vector) {
        System.out.print(n + " ");
    }
    System.out.println();
    for (int n: rotcev) {
        System.out.print(n + " ");
    }
  }
}

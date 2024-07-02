<<<<<<< HEAD
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
=======
/*
7. Criar um programa que quando executado exiba todas as tabuadas do 1 ao 10.
 */

public class App {
  public static void main(String[] args) throws Exception {
    int number, tabuada, result;

    for (int i = 1; i <= 10; i++) {
      System.out.println("\n" + "Tabuada do " + i + ":");

      for (int j = 1; j <= 10; j++) {
        System.out.println(i + " X " + j + " = " + i * j);
      }
    }
  }
>>>>>>> e53c64f3f1c018f37bb6365c6f82fdb291093e88
}

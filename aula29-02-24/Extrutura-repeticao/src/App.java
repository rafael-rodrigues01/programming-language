import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {

    /*
     * 
     * While
     * 
     * int i = 0;
     * 
     * while (i < 100) {
     * System.out.println(i);
     * i+=2;
     * }
     */

    /*
     * do while
     * 
     * int op;
     * 
     * Scanner in = new Scanner(System.in);
     * 
     * do {
     * System.out.println("1. opcao1\n2. opcao2\n3. opcao3\nEscolha uma opcao:");
     * op = in.nextInt();
     * 
     * } while (op < 1 || op > 3);
     * System.out.println("voce escolheu " + op);
     * 
     */

    /*
     * for
     * 
     * for (int i = 100; i > 0; i--) {
     * System.out.println(i);
     * }
     */

    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.println(j);
      }
      System.out.println("Sequencia " + i);
    }

  }
}

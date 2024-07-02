/*
<<<<<<< HEAD
8. Criar um programa onde o usuário entra com um número e o programa diz se o númerodigitado é primo ou não
=======
8. Criar um programa onde o usuário entra com um número e o programa diz se o número digitado é primo ou não
>>>>>>> e53c64f3f1c018f37bb6365c6f82fdb291093e88
 */

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
<<<<<<< HEAD
    int number;

    Scanner in = new Scanner(System.in);

    System.out.println("Digite um número:");
    number = in.nextInt();

    int count = 0;

    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        if (number % number == 0) {
          count++;
          System.out.println(count);
        }
      }
    }

    if (count == 2) {
      System.out.println("O número " + number + " é primo.");
      in.close();
      return;
    }

    System.out.println("O número " + number + " não é primo.");

    in.close();

  }
}
=======
    long n;
    boolean eprimo=true;
    Scanner in = new Scanner(System.in);
    do {
        System.out.println("Digite um numero: ");
        n = in.nextLong();
    }while(n<0);
    if(n==1)
        eprimo=false;
    for(long i=n/2;i>1;i--){
        if(n%i==0) {
            eprimo = false;
            break;
        }
    }
    if(eprimo)
        System.out.println("É primo");
    else
        System.out.println("Não é primo");
    in.close();

  }
}
>>>>>>> e53c64f3f1c018f37bb6365c6f82fdb291093e88

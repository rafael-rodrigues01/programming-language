/*
8. Criar um programa onde o usuário entra com um número e o programa diz se o número digitado é primo ou não
 */

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
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
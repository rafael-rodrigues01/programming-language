/*
O usuário entra com um número inteiro e o programa indica se o número é ímpar ou par
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        number = in.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " é par!");
            in.close();
            return;
        }

        System.out.println(number + " é ímpar");
    }
}


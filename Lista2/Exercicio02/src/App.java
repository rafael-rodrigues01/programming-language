/*
 * 
 * 2. O usuário entra com dois números
 *  inteiros e o programa indica qual o maior”
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int firstNumber, secondNumber, result;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        firstNumber = in.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        secondNumber = in.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("O número " + firstNumber + " é maior que " + secondNumber);
            in.close();
            return;
        }

        System.out.println("O número " + secondNumber + " é maior que " + firstNumber);
        in.close();
    }
}

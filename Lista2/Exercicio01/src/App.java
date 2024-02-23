/*
 * 
 * 1. Receba um número real e caso ele seja positivo 
 * imprima sua raiz quadrada, casocontrário imprima
 *  a mensagem: “Valor inválido!”
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double number, result;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número real");
        number = in.nextDouble();

        if (number > 0) {
            result = Math.sqrt(number);
            System.out.println("A raiz quadrada do número digitado é: " + result);
            in.close();
            return;
        }

        System.out.println("Valor inválido!");
        in.close();
    }
}
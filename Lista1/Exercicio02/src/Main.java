import java.lang.Math;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, result;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        number = in.nextInt();
        result = Math.pow(number, 2);

        System.out.println("O quadrado do número digitado é: " + result);

    }
}
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {

    double base, height, area, perimeter;
    int choice;

    Scanner in = new Scanner(System.in);

    System.out.println();

    System.out.println("Menu: \n");
    System.out.println("1. Circulo");
    System.out.println("2. Triângulo Retângulo");
    System.out.println("3. Retângulo");

    System.out.println();

    System.out.println("Escolha uma opção: ");
    choice = in.nextInt();

    System.out.println("Informe a base:");
    base = in.nextDouble();

    System.out.println("Informe a altura:");
    height = in.nextDouble();

    System.out.println();

    switch (choice) {
      case 1:
        result = number1 + number2;
        System.out.println("Resultado: " + number1 + " + " + number2 + " = " + result);
        break;
      case 2:
        result = number1 - number2;
        System.out.println("Resultado: " + number1 + " - " + number2 + " = " + result);
        break;
      case 3:
        result = number1 * number2;
        System.out.println("Resultado: " + number1 + " x " + number2 + " = " + result);
        break;
      case 4:
        result = number1 / number2;
        System.out.println("Resultado: " + number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Valor inválido!");
        break;
    }

    in.close();
  }
}

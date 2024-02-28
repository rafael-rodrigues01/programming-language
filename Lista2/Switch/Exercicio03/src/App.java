import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {

    double perimeter, ray, result, base, height, areaOfTriangle, areaOfRectangle;
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

    System.out.println();

    switch (choice) {
      case 1:

        double pi = Math.PI;

        System.out.println("Digite o raio de um circulo:");
        ray = in.nextDouble();

        result = Math.pow(ray, 2) * pi;

        System.out.println("A área é: " + result + " cm²");

        in.close();
        break;
      case 2:
        System.out.println("Digite a base de um triângulo retângulo:");
        base = in.nextDouble();

        System.out.println("Digite a altura de um triângulo retângulo:");
        height = in.nextDouble();

        areaOfTriangle = (base * height) / 2;
        perimeter = base * height;

        System.out.println("Área: " + areaOfTriangle);
        System.out.println("Perímetro: " + perimeter);

        in.close();
        break;
      case 3:
        System.out.println("Digite a base de um retângulo:");
        base = in.nextDouble();

        System.out.println("Digite a altura de um retângulo:");
        height = in.nextDouble();

        areaOfRectangle = base * height;

        System.out.println("Área do Retângulo: " + areaOfRectangle);

        in.close();
        break;

      default:
        System.out.println("Valor inválido!");
        break;
    }

    in.close();
  }
}

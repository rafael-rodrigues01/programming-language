import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {

    int day;

    Scanner in = new Scanner(System.in);

    System.out.println("Digite um número inteiro:");
    day = in.nextInt();

    switch (day) {
      case 1:
        System.out.println(day + " - Domingo");
        break;
      case 2:
        System.out.println(day + " - Segunda");
        break;
      case 3:
        System.out.println(day + " - Terça-feira");
        break;
      case 4:
        System.out.println(day + " - Quarta-feira");
        break;
      case 5:
        System.out.println(day + " - Quinta-feira");
        break;
      case 6:
        System.out.println(day + " - Sexta-feira");
        break;
      case 7:
        System.out.println(day + " - Sábado");
        break;

      default:
        System.out.println("Número digitado não corresponde a nenhum dia da semana!");
        break;
    }

    in.close();
  }
}

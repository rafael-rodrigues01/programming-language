import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {

    double money, troco;
    int choice;

    Scanner in = new Scanner(System.in);

    System.out.println("Insira o dinheiro:");
    money = in.nextDouble();

    System.out.println();

    System.out.println("Menu: \n");
    System.out.println("1. Café Expresso R$ 0,50");
    System.out.println("2. Café Longo R$ 1,00");
    System.out.println("3. Capuchino R$ 2,50");
    System.out.println("4. Chocolate R$ 2,00");

    System.out.println();

    System.out.println("Escolha uma opção: ");
    choice = in.nextInt();

    System.out.println();

    switch (choice) {
      case 1:
        System.out.println("Bebida Selecionada: Café Expresso");
        troco = money - 0.50;

        if (troco > 0) {
          System.out.println("Seu Troco: R$ " + troco);
        } else {
          System.out.println("Valor abaixo do produto. Por favor insira mais dinheiro na máquina!");
        }
        break;
      case 2:
        System.out.println("Bebida Selecionada: Café Longo");

        troco = money - 1.00;

        if (troco > 0) {
          System.out.println("Seu Troco: R$ " + troco);
        } else {
          System.out.println("Valor abaixo do produto. Por favor insira mais dinheiro na máquina!");
        }
        break;
      case 3:
        System.out.println("Bebida Selecionada: Capuchino");

        troco = money - 2.50;

        if (troco > 0) {
          System.out.println("Seu Troco: R$ " + troco);
        } else {
          System.out.println("Valor abaixo do produto. Por favor insira mais dinheiro na máquina!");
        }
        break;
      case 4:
        System.out.println("Bebida Selecionada: Chocolate");

        troco = money - 2.00;

        if (troco > 0) {
          System.out.println("Seu Troco: R$ " + troco);
        } else {
          System.out.println("Valor abaixo do produto. Por favor insira mais dinheiro na máquina!");
        }
        break;

      default:
        System.out.println("Valor inválido!");
        break;
    }

    in.close();
  }
}


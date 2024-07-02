/*
Jogo da tabuada: o aplicativo irá exibir as tabuadas do 1 ao 10 uma operação por vez.Entre uma operação e outra o usuário deve inserir o resultado da conta, se o resultadodigitado estiver correto o programa exibe a próxima operação caso contrário o jogo éencerrado mostrando a mensagem de que o jogador perdeu (deve exibir a opção jogarnovamente). Caso o jogador complete toda a tabuada sem erros o programa deve exibiruma mensagem parabenizando o jogador (e perguntar se deseja jogar novamente).
 */

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    double number;

    double result = 0;

    Scanner in = new Scanner(System.in);

    for (int i = 1; i < 11; i++) {
      System.out.println("\n" + "Tabuada do " + i);
      for (int j = 1; j <= 10; j++) {
        result = i * j;
        System.out.println("Digite o resultado de " + i + " X " + j + " = " + " ? ");
        number = in.nextDouble();

        if (number == result) {
          System.out.println(i + " X " + j + " = " + result);
        } else {
          System.out.println("Jogador perdeu ! (Jogar novamente)");
          return;
        }

      }
    }

    System.out.println("Parabéns você venceu ! Deseja jogar novamente ?");

    in.close();
  }
}

/*
4. Faça um programa que apresente na tela a tabela de conversão de Graus Celsius para
Fahrenheit, de -80oC até 80oC com um incremento de 10oC.
 */

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    double fahrenheit;

    Scanner in = new Scanner(System.in);

    for (int i = -80; i <= 80; i += 10) {
      fahrenheit = i * 1.8 + 32;
      System.out.println(i + " Graus Celsius " + " = " + fahrenheit + " Graus Fahrenheit");
    }

    in.close();
  }
}

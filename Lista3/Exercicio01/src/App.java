// 1. Criar um programa que receba um valor do usuário e exiba a sua tabuada multiplicandoo 
// número digitado pela sequência de 0 a 10

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    double value; 

    Scanner in = new Scanner(System.in);

    System.out.println("Digite um número:");
    value = in.nextDouble();

    for (int i = 1; i <= 10; i++) {
      System.out.println(value + " X " + i + " = " + value * i);
    }
  }
}

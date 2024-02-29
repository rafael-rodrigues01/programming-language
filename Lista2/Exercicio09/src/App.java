/*
9. Dados três valores, verificar se eles podem ser valores dos lados de um triângulo. Se forem, imprima se é um triângulo equilátero, isósceles ou escaleno.Condição de existência de um triângulo: a medida de qualquer um dos lados de um triângulo deve ser menor do que a soma dos outros dois lados e maior que diferença entre essas mesmas medidas.Triângulo equilátero: possui todos os lados iguais.Triângulo isósceles: possui apenas dois lados iguais.Triângulo escaleno: todos os lados são diferentes.
 */

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    double firstSide, secondSide, thirdSide;
    boolean triaguloExiste;

    Scanner in = new Scanner(System.in);

    System.out.println("Digite o primeiro lado do triângulo:");
    firstSide = in.nextDouble();

    System.out.println("Digite o segundo lado do triângulo:");
    secondSide = in.nextDouble();

    System.out.println("Digite o terceiro lado do triângulo:");
    thirdSide = in.nextDouble();

    triaguloExiste = firstSide < (secondSide + thirdSide) && firstSide > Math.abs(secondSide - thirdSide) &&
                     secondSide < (firstSide + secondSide) && secondSide > Math.abs(firstSide - thirdSide) &&
                     thirdSide < (secondSide + firstSide) && thirdSide > Math.abs(secondSide - firstSide);

    if (triaguloExiste == true) {
      if (firstSide == secondSide && secondSide == thirdSide) {
        System.out.println("Triângulo equilátero!");
      } else if (firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide) {
        System.out.println("Triângulo isósceles");
      } else {
        System.out.println("Triângulo escaleno");
      }
    } else {
      System.out.println("Triângulo inexistente!");
    }

    in.close();

  }
}

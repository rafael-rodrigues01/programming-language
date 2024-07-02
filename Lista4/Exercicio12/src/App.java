/*
12. Declare e inicialize uma matriz 3x3 e calcule a sua determinante.
*/

public class Main {
  public static void main(String[] args) {
      int[][] matrix = {
          {2, 5, 8},
          {3, 7, 1},
          {6, 4, 9}
      };

      int determinant = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[2][1] * matrix[1][2])
                      - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[2][0] * matrix[1][2])
                      + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[2][0] * matrix[1][1]);

      System.out.println("Determinante da matriz é: " + determinant);
  }
}

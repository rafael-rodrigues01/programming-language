
/*
9. Declare e inicialize uma matriz 5x5 em seguida exiba sua diagonal secundária.
*/

public class App {
  public static void main(String[] args) throws Exception {
    int [][] matrix = {
      { 1, 2, 3, 4, 5},
      { 6, 7, 8, 9,10},
      {11,12,13,14,15},
      {16,17,18,19,20},
      {21,22,23,24}};

      diagrSecundario(matrix);

  }

  static void diagrSecundario (int [][]matrix) {
    if(matrix.length == matrix[0].length) {
      for(int i = 0; i < matrix.length; i++) {
        System.out.print(matrix[i][matrix[0].length -1 - i] + ", ");
      }
    } else {
      System.out.println("A matriz não é quadrada!");
    }
  }
}

// 8. Declare e inicialize uma matriz 5x5 em seguida exiba sua diagonal principal.

public class App {
  public static void main(String[] args) throws Exception {
    int [][] matrix = {
      { 1, 2, 3, 4, 5},
      { 6, 7, 8, 9,10},
      {11,12,13,14,15},
      {16,17,18,19,20},
      {21,22,23,24,25}};

    for(int i = 0; i < 5; i++) {
      System.out.print(matrix[i][i] + ", ");
    }
  }

}

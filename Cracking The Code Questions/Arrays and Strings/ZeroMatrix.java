import java.util.*;

public class ZeroMatrix {
  static void setZeros(int[][] matrix) {
    boolean[] row = new boolean[matrix.length];
    boolean[] column = new boolean[matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          row[i] = true;
        column[j] = true;
        }
      }
    }
    for (int i = 0; i < row.length; i++) {
      if (row[i])
        nullifyRow(matrix, i);
    }
    for (int i = 0; i < column.length; i++) {
      if (column[i])
        nullifyCol(matrix, i);
    }
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + "\t");
      }
      System.out.println();
    }
  }

  static void nullifyRow(int[][] matrix, int row) {
    for (int i = 0; i<matrix.length; i++) {
       matrix[row][i] = 0;
    }
  }
  static void nullifyCol(int[][] matrix, int column) {
    for (int i = 0; i<matrix.length; i++) {
     matrix[i][column] = 0;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter rows");
    int r = sc.nextInt();
    System.out.println("Enter columns");
    int c = sc.nextInt();
    System.out.println("Enter " + (r * c) + " elements");
    int matrix[][] = new int[r][c];
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    setZeros(matrix);
    sc.close();
  }
}

import java.util.*;

public class RotateMatrix {
  public static boolean rotateMat(int arr[][]) {
    if (arr.length == 0 || arr[0].length != arr.length)
      return false;
    int n = arr[0].length;
    for (int layer = 0; layer < n / 2; layer++) {
      int first = layer;
      int last = n - 1 - layer;
      for (int i = first; i < last; i++) {
        int offset = i - first;
        int temp = arr[first][i];
        arr[first][i] = arr[last - offset][first];
        arr[last - offset][first] = arr[last][last - offset];
        arr[last][last - offset] = arr[i][last];
        arr[i][last] = temp;
       }
    }
    for (int i = 0; i < arr[0].length; i++) {
      for (int j = 0; j < arr.length; j++) {
        System.out.print(arr[i][j]+ "\t");
      }
      System.out.println();
    }
    return true;
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
    rotateMat(matrix);
    sc.close();
  }
}

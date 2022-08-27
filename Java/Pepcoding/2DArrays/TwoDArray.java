import java.util.*;

public class TwoDArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, m;
    n = sc.nextInt();
    m = sc.nextInt();
    int arr[][] = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = sc.nextInt();
      }

    }
    System.out.println(arr.length);
    System.out.println(arr[0].length);
    System.out.println(arr[1].length);
    sc.close();
  }
}
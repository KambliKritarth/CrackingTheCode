import java.util.*;
import java.lang.Math;
public class pascalTriangle2 {
 
  public static void pascal(int n) {
    int spaces = n-1,a;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < spaces - i; j++) {
        System.out.print(" ");
      }
      int num = (int) Math.pow(11, i);
      while (num > 0) {
        a = num % 10;
        num = num / 10;
        System.out.print(a + " ");
      }
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    pascal(num);
    sc.close();
  }
}

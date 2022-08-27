import java.util.Scanner;

public class PyramidInteresting {
  public static void main(String[] args) {
    int n, a = 0, b = 3, i, re, j;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for (i = 1; i <= n; i++) {
      for (j = 1; j <= i; j++) {
        a = a + 2;
        if (i == 1)
          b = 3;
        else
          b = b + 4;
        re = a * b;
        String str = Integer.toString(re);
        String str1 = "";
        for (int k = str.length(); k < 5; k++) {
          str1 += "0";
        }
        str1 += str; 
        System.out.print(str1+" ");
      }
      System.out.println();
    }
  }
}
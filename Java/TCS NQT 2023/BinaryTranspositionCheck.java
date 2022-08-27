import java.util.*;
public class BinaryTranspositionCheck{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    String str1 = sc.next();
    String str2 = sc.next();
    if (str1.length() != len || str2.length() != len) {
      System.out.println("No");
      System.exit(1);
    }
    int count_ones = 0, count_zeroes = 0;
    for (int i = 0; i < str1.length(); i++) {
      if (str1.charAt(i) == '1')
        count_ones++;
      else if (str1.charAt(i) == '0')
        count_zeroes++;
    }
    for (int i = 0; i < str2.length(); i++) {
      if (str2.charAt(i) == '1')
        count_ones--;
      else if (str2.charAt(i) == '0')
        count_zeroes--;
    }
    System.out.println(count_zeroes == 0 && count_ones == 0 ? "Yes" : "No");
    sc.close();
  }
}
import java.util.*;

public class IsUnique {
  static boolean isUniqueChars(String str) {
    boolean[] char_set = new boolean[128];
    if (str.length() > 128) {
      return false;
    }
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (char_set[ch]) {
        return false;
      }
      char_set[ch] = true;
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    System.out.println(isUniqueChars(input));
    sc.close();
  }
}
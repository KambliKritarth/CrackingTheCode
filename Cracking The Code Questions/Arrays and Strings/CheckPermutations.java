import java.util.*;

public class CheckPermutations {
  static String Sort(String str) {
    char content[] = str.toCharArray();
    java.util.Arrays.sort(content);
    return new String(content);
  }
  static boolean checkPerms(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    return Sort(s).equals(Sort(t));
}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input1 = sc.next();
    String input2 = sc.next();
    System.out.println(checkPerms(input1,input2));
    sc.close();
  }
}

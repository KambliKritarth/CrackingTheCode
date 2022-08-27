import java.util.*;
class CheckPerm {
  public String sort(String s) {
    char[] content = s.toCharArray();
    Arrays.sort(content);
    return new String(content);
  }

  boolean permutation(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    //System.out.println(sort(s)+sort(t));
    return sort(s).equals(sort(t));
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    CheckPerm cp = new CheckPerm();
    System.out.println(cp.permutation(str1, str2));
    sc.close();
  }  
}

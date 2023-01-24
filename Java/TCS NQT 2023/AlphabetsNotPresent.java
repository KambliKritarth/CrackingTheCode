import java.util.*;

public class AlphabetsNotPresent {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine().toLowerCase();
    HashMap<Character, Boolean> hm = new HashMap<Character, Boolean>();
    for (char c = 'a'; c <= 'z'; c++) {
          hm.put(c, false);
      }
      for (int i = 0; i < str.length(); i++) {
        hm.put(str.charAt(i), true);
      }
      int flag = 0;
      for (char c = 'a'; c <= 'z'; c++) {
        if (!hm.get(c)) {
          System.out.print(c);
          flag = 1;
        }
      }
      if (flag == 0) {
        System.out.println(0);
      }
    sc.close();
  }
}

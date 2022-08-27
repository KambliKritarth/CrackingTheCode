//import java.io.*;
import java.util.*;

public class HighestFrequency {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    HashMap<Character, Integer> hm = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (hm.containsKey(ch)) {
        int of = hm.get(ch);
        int nf = of + 1;
        hm.put(ch, nf);
      } else {
        hm.put(ch, 1);
      }
    }
    char ele = str.charAt(0);
    for (Character key : hm.keySet()) {
      if (hm.get(ele) < hm.get(key)) {
        ele = key;
      }
    }
   System.out.println(" Maximum frequency letter: "+ele +" -> "+hm.get(ele));
    sc.close();
    }

}
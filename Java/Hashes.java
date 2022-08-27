import java.util.*;

public class Hashes {
  public static HashMap<String,Integer> getHash() {
    Scanner sc = new Scanner(System.in);
    String str = "";
    int a = 0;
    int n = sc.nextInt();
    HashMap<String, Integer> number = new HashMap<>();
    for (int i = 0; i < n; i++) {
      str = sc.next();
      a = sc.nextInt();
      number.put(str, a);
    }
    sc.close();
    return number;
  }

  public static void printHash(HashMap<String,Integer> hashmap) {
    Set<String> keys = hashmap.keySet();
    for (String i : keys) {
      System.out.println(i+ " : "+hashmap.get(i));
    }
  }
  public static void main(String[] args) {
    HashMap<String, Integer> num = getHash();
    printHash(num);
  }
  
}

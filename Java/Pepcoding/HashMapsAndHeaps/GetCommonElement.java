import java.util.*;

public class GetCommonElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n1 = sc.nextInt();
    int a1[] = new int[n1];
    for (int i = 0; i < n1; i++) {
      a1[i] = sc.nextInt();
    }
    
    int n2 = sc.nextInt();
    int a2[] = new int[n1];
    for (int i = 0; i < n2; i++) {
      a2[i] = sc.nextInt();
    }
    HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
    for (int element : a1) {
      if (hmap.containsKey(element)) {
        int of = hmap.get(element);
        int nf = of + 1;
        hmap.put(element, nf);
      } else {
        hmap.put(element, 1);
      }
    }
    for (int element : a2) {
      if (hmap.containsKey(element)) {
        System.out.println(element);
        hmap.remove(element);
      } 
    }
    sc.close();
  }
}

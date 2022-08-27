import java.util.*;

public class LargestConsecutiveSequence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    HashMap<Integer, Boolean> hmap = new HashMap<Integer, Boolean>();
    for (int key : arr) {
      hmap.put(key, true);
    }
    for (int key : arr) {
      if (hmap.containsKey(key - 1))
        hmap.put(key, false);
    }
    int msp = 0;
    int ml = 0;
    for (int val : arr) {
      if (hmap.get(val) == true) {
        int tl = 1;
        int tsp = val;
        while (hmap.containsKey(tsp + tl)) {
          tl++;
        }
        if (tl > ml) {
          msp = tsp;
          ml = tl;
        }
      }
    }
    for (int i = 0; i < ml; i++) {
      System.out.println(msp + i);
    }
    sc.close();
  }
}


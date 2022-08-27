import java.util.*;

public class Priority {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
    int ranks[] = { 22, 11, 3, 44, 55, 21 };
    for (int val : ranks) {
      pq.add(val);
    }
    while (pq.size() > 0) {
      System.out.println(pq.peek());
      pq.remove();
    }
  }
}

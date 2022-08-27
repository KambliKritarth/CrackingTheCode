import java.util.*;
public class KLargestElements {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
    System.out.println("Enter n numbers to select the k largest numbers from");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      pq.add(sc.nextInt());
    }
    System.out.println("Enter k numbers to select from the n numbers");
    int k = sc.nextInt();
    for (int i = 0; i < k; i++) {
      System.out.println(pq.peek());
      pq.remove();
    }
    sc.close();   
  }
}

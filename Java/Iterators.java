import java.util.*;

public class Iterators {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> al = new ArrayList<Integer>();
    System.out.println("Enter the number of values an arraylist can take");
    int n = sc.nextInt();
    System.out.println("Enter values for your arraylist");
    for (int i = 0; i < n; i++) {
      al.add(sc.nextInt());
    }
    Iterator<Integer> i = al.iterator();
    while (i.hasNext()) {
      if (i.next() % 11 == 0) {
        i.remove();
      }

    }
    sc.close();
  }
  
}

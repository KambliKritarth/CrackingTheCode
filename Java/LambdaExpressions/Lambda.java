// learnt lambda expressions and functional interfaces as well

import java.util.*;
class Lambda{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    for (int i = 0; i < 5; i++) {
      numbers.add(sc.nextInt());
    }
      numbers.forEach((n) -> {
      System.out.print(n+" ");;} );
    sc.close();
  }
}
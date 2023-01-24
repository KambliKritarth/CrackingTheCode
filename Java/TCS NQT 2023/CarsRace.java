import java.util.*;

public class CarsRace {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int x = sc.nextInt();
    int seconds = 0;
    int n1init = x;
    int n2init = 0;
    if (n2 < n1) {
      System.out.println("0");
    }
    else {
      while ((n1init) > n2init) {
        n1init += n1;
        n2init += n2;
        ++seconds;
      }
      System.out.println(seconds);
    }
    sc.close();
  }
}
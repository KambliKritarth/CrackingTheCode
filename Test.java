public class Test {
  static int plus(int n) {
    if (n == 1)
      return 1;
    return n+plus(n - 1);
  } 
  public static void main(String[] args) {
    // String s1 = new String("java");
    // String s2 = new String("JAVA");
    // System.out.println(s1 = s2);
    System.out.println(plus(18399));
  }
}
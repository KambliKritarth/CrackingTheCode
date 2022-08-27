public class LeftShiftAndRightShift {
  static void LeftShift(int a, int b){
    System.out.println(a<<b);
  }
  static void RightShift(int a, int b){
    System.out.println(a>>b);
  }
  public static void main(String[] args) {
    int a = 5;
    int b = 4;
    LeftShift(a,b);
    RightShift(a,b);
  }
}

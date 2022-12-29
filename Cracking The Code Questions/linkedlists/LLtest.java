public class LLtest {
  LLtest smth;
  int num;

  public LLtest(int val) {
    //smth = null;
    num = val;
  }

  public static void main(String[] args) {
    LLtest ll = new LLtest(5);
    //smth = new LLtest(6);
    //LLtest other = this;
    System.out.println("value " + ll.num);
    //System.out.println("smth " + smth);
    System.out.println("ll " + ll);
  }
}

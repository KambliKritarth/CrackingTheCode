public class Bit {
  public static void main(String[] args) {
    int checker = 0;
    String str = "titans";
        for (int i = 0; i < str.length(); i++) {
          int val = str.charAt(i) - 'a';
          System.out.println(val);
          System.out.println(1 << val);
             System.out.println(checker&(1<<val));
            if ((checker & (1 << val)) > 0) {
                System.out.println("False");
            }
            checker |= (1 << val);
        }
  }  
}

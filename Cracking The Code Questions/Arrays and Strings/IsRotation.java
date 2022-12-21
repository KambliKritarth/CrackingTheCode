import java.util.*;

public class IsRotation {

  static boolean isRotation(String str1, String str2) {
    if(str1.length()==str2.length()&&str1.length()!=0){
      String s1s1 = str1+str1;
      return s1s1.contains(str2);
    }
    return false;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input1 = sc.next();
    String input2 = sc.next();
    System.out.println(isRotation(input1, input2));
    sc.close();
  }
}

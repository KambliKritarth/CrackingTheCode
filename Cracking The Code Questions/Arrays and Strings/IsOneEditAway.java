import java.util.*;

public class IsOneEditAway {

  public static boolean oneEdit(String s1, String s2) {
    if (Math.abs(s2.length() - s1.length()) > 1) {
      return false;
    }
    String str1 = s2.length() > s1.length() ? s1 : s2;
    String str2 = s2.length() > s1.length() ? s2 : s1;
    //System.out.println(str1 + " " + str2);
    int index1 = 0;
    int index2 = 0;
    boolean foundDifference = false;
    while (index1 < str1.length() && index2 < str2.length()) {
      if(str1.charAt(index1)!=str2.charAt(index2)){
        if (foundDifference)return false;
        foundDifference = true;
        if(str1.length()==str2.length())
        {
          index1++;
        }
      }
      else{
        index1++;
      }
      index2++;
    }
  return true;
}
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input1 = sc.next();
    String input2 = sc.next();
    System.out.println(oneEdit(input1, input2));
    sc.close();
  }
}

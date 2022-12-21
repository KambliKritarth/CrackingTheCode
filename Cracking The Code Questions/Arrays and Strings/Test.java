//import java.util.*;

public class Test {
  static int getCharNumber(Character c) {
    /* int a = Character.getNumericValue('a');
    int z = Character.getNumericValue('z');
    int val = Character.getNumericValue(c);
    if (a <= val && val <= z) {
      return val - a;
    }*/
    return -1; 
  }
  public static void main(String[] args) {
/*     boolean allFalseArray[] = new boolean[128];
String str = "jhsajkfhjkashf";
for (int i = 0; i < str.length(); i++) {
  char ch = str.charAt(i);
  allFalseArray[ch] = true;
}
for (int i = 0; i < allFalseArray.length; i++) {
  if (!allFalseArray[i]) {
System.out.print(i);
  }
  else {
System.out.print(allFalseArray[i]+""+i);
  }
  } 
  System.out.println(Character.getNumericValue('b'));
  System.out.println(getCharNumber('b')); */
/* int a = 5;
int len = String.valueOf(a).length();
System.out.println(len); */
String str = "cupcake";
String cup = "cup";
System.out.println(str.contains(cup));
  }
}

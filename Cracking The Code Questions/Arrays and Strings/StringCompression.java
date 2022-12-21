
import java.util.*;
public class StringCompression {
 
  static String strCompress(String str) {
    int finalLength = CountCompression(str);
    if (finalLength >= str.length())
      return str;
    int countConsecutive=0;
    StringBuilder compressed = new StringBuilder(finalLength);
    for (int i = 0; i < str.length(); i++) {
      countConsecutive++;
      if ((i + 1) >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
        compressed.append(str.charAt(i));
        compressed.append(String.valueOf(countConsecutive));
        countConsecutive = 0;
      }
    }
    
    return compressed.toString(); 
  }
  
  static int CountCompression(String str) {
    int compressedlength = 0;
    int countConsecutive = 0;
    for (int i = 0; i < str.length(); i++) {
      countConsecutive++;
      if (i+1 >= str.length()||str.charAt(i) != str.charAt(i + 1)) {
        compressedlength += +1 + String.valueOf(countConsecutive).length();
        countConsecutive = 0;
      }
    }
    return compressedlength;
  }

  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    String input = sc.next();
    System.out.println(strCompress(input));
    sc.close();
 } 
}

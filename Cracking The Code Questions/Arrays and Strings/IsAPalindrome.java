import java.util.*;

public class IsAPalindrome {
  static boolean isPermutationOfPalindrome(String str) {
    int countOdd = 0;
    int[] table = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
    for (char c : str.toCharArray()) {
      int x = getCharNumber(c);
      if (x != -1) {
        table[x]++;
        if (table[x] % 2 == 0) {
          countOdd++;
        }
        else {
          countOdd--;
        }
      }
    }
    return countOdd <= 1;
  }

  static int getCharNumber(Character c) {
    int a = Character.getNumericValue('a');
    int z = Character.getNumericValue('z');
    int val = Character.getNumericValue(c);
    if (a <= val && z >= val) {
      return val - a;
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(isPermutationOfPalindrome(str));
    sc.close();
  }
}

import java.util.*;

public class URLify {
  void invertString(char ch[], int length) {
    int spacecount = 0, index, i = 0;
    //counting spaces
    for (i = 0; i < length; i++) {
      if (ch[i] == ' ') {
        spacecount++;
      }
    }
    // for n length, 2n+2 worth length of string is needed
    index = length + spacecount * 2;
    //declaring string array of the index size
    String str = "";
    //char str[] = new char[index];
    /* 
    if (length < str.length)
      str[length] = '\0';*/
    //putting characters in reverse order 
    for (i = 0; i < ch.length; i++) {
      if (ch[i] == ' ') {
        str = str + "%20";
      } else {
        str = str + ch[i];
      }
    }
    System.out.println(str);
    //only to put out the warning in VSCode
    System.out.println(index);
}

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    URLify url = new URLify();
    url.invertString(word.toCharArray(), word.length());
    sc.close();
  }
}

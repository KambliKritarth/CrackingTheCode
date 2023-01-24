import java.util.*;
//import java.lang.*;

public class Min<T> extends Stack<NodeWithMin> {
  public void push(int min) {

  }

  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Min<Integer> ms = new Min<Integer>();
    int n = 4;
    while (n >= 0) {
      int ele = sc.nextInt();
      ms.push(ele);
      n--;
    }
    sc.close();
  }
}
class NodeWithMin {
    int val;
    int min;
    NodeWithMin(int val,int min){
      this.val = val;
      this.min = min;
    }
}
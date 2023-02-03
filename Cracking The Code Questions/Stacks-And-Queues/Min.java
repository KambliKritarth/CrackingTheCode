import java.util.*;
//import java.lang.*;

public class Min extends Stack<NodeWithMin> {
  public void push(int val) {
    int min = Math.min(val, min());
    super.push(new NodeWithMin(val, min));
  }

  public int min() {
    if (this.isEmpty()) {
      return Integer.MAX_VALUE;
    } else {
      return peek().min;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Min ms = new Min();
    int n = 4;
    while (n > 0) {
      int ele = sc.nextInt();
      ms.push(ele);
      n--;
    }
    System.out.println(ms.min());
    sc.close();
  }
}

class NodeWithMin {
  int val;
  int min;

  NodeWithMin(int val, int min) {
    this.val = val;
    this.min = min;
  }
}
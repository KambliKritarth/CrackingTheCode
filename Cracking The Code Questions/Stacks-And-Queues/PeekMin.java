import java.util.*;

public class PeekMin extends Stack<MinClass> {
  
  public int showMin(int a) {
    int min = Math.min(a, peek().min);
    return min;
  }

  public MinClass peek() {
    if (top == null) {
      throw new EmptyStackException();
    }
    return top;
  }

 public MinClass top;
public static void main(String[] args) {
    
  }
}

class MinClass {
  int val;
  int min;

  public MinClass(int val, int min) {
    this.val = val;
    this.min = min;
  }
}

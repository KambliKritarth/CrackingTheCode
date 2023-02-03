import java.util.*;
public class SetOfStacks {
  public ArrayList<Stack> stacks = new ArrayList<Stack>();
  int capacity;

  public SetOfStacks(int capacity) {
    this.capacity = capacity;
  }

  public Stack getLastStack() {
    if (stacks.size() == 0)
      return null;
    return stacks.get(stacks.size() - 1);
  }

  public void push(int v) {
    Stack last = getLastStack();
    if (last == null && !last.isFull()) {
      last.push(v);
    } else {
      Stack newStack = new Stack(capacity);
      newStack.push(v);
      stacks.add(newStack);
    }
  }

  public int pop() {
    Stack last = getLastStack();
    if(last==null)
      throw new EmptyStackException();
    int v = last.pop();
    if(last.size==0)
      stacks.remove(stacks.size() - 1);
    return v;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SetOfStacks sos = new SetOfStacks(5);
    sos.push(1);
    sos.push(4);
    sos.push(3);
    sos.push(6);
    sos.push(7);
    sos.push(4);
    sos.push(3);
    sos.push(6);
    sos.push(3);
    sos.push(4);
    sos.pop();
    sos.pop();
    sos.pop();
    for (Stack i : sos.stacks) {
      System.out.print(i.top.val+" ");
      System.out.print(i.bottom.val + " ");
      System.out.println();
    }
    sc.close();
  }
}

class Stack {
  private int capacity;
  public Node top, bottom;
  public int size = 0;

  public boolean isFull() {
    return size == capacity;}
  Stack(int capacity) {
    this.capacity = capacity;
  }

  public void join(Node above, Node below){
    if(above!=null) 
      below.above = above;
    if(below!=null)
      above.below = below;
  }

  public boolean push(int v) {
    if (size >= capacity) {
      return false;
    }
    size++;
    Node n = new Node(v);
    if (size == 1)
      bottom = n;
    join(n, top);
    top = n;
    return true;
  }
  public int pop() {
    Node t = top;
    top = top.below;
    size--;
    return t.val;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int removeBottom() {
    Node b = bottom;
    bottom = bottom.above;
    if (bottom != null)
      bottom.below = null;
    size--;
    return b.val;
  }
}

class Node {
  int val;
  Node above;
  Node below;

  Node(int val) {
    this.val = val;
  }
  
}

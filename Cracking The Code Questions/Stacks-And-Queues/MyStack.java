import java.util.*;
public class MyStack<T> {
  private static class StackNode<T> {
    private T data;
    private StackNode<T> next;

    public StackNode(T data) {
      this.data = data;
    }
  }

  private StackNode<T> top;

  public T pop() {
    if (top == null)
      throw new EmptyStackException();
    T item = top.data;
    top = top.next;
    return item;
  }

  public void push(T item) {
    StackNode<T> t = new StackNode<T>(item);
    t.next = top;
    top = t;
  }

  public T peek() {
    if (top == null) {
      throw new EmptyStackException();
    }
    return top.data;
  }

  public boolean isEmpty() {
    return top == null;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MyStack<Integer> ms = new MyStack<Integer>();
    int n = 4;
    while (n >= 0) {
      int ele = sc.nextInt();
      ms.push(ele);
      n--;
    }
    System.out.println(ms.peek());
    ms.pop();
    System.out.println(ms.peek());
    sc.close();
  }
}

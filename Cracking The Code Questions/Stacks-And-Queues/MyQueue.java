import java.util.NoSuchElementException;
import java.util.Scanner;

public class MyQueue<T> {
  private static class QueueNode<T> {
    private T data;
    private QueueNode<T> next;

    public QueueNode(T data) {
      this.data = data;
    }
  }

  private QueueNode<T> first;
  private QueueNode<T> last;

  public void add(T item) {
    QueueNode<T> node = new QueueNode<T>(item);
    if (last != null) {
      last.next = node;
    }
    last = node;
    if (first == null) {
      first = last;
    }
  }
  
  public T remove() {
    if (first == null)
      throw new NoSuchElementException();
    T data = first.data;
    first = first.next;
    if (first == null) {
      last = null;
    }
    return data;
  }

  public T peek() {
    if (first == null)
      throw new NoSuchElementException();
    return first.data;
  }

  public boolean isEmpty() {
    return first == null;
  }
  public static void main(String[] args) {
    MyQueue<Integer> mq = new MyQueue<Integer>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int m = sc.nextInt();
      mq.add(m);
    }
    System.out.println(mq.peek());
    mq.remove();
    System.out.println(mq.peek());
    mq.remove();
    mq.remove();
    mq.remove();
    System.out.println(mq.isEmpty());
    mq.remove();
    System.out.println(mq.isEmpty());
    System.out.println(mq.first);
    sc.close();
  }
}

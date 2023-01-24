import java.util.*;
public class FixedMultiStack {
  int stackCapacity;
  int numberOfStacks = 3;
  int values[];
  int sizes[];

  public FixedMultiStack(int stackSize) {
    stackCapacity = stackSize * numberOfStacks;
    values = new int[stackCapacity];
    sizes = new int[numberOfStacks];
  }

  public void push(int item, int stackNum) {
    if (isFull(stackNum)) {
      System.out.println("FullStackException");
      return;
    }
    sizes[stackNum]++;
    values[indexOfTop(stackNum)] = item;
  }

  public int pop(int stackNum) {
    if (isEmpty(stackNum)) {
      System.out.println("EmptyStackException");
      return 0;
    }
    int data = values[indexOfTop(stackNum)];
    values[indexOfTop(stackNum)] = 0;
    sizes[stackNum]--;
    return data;
  }

  public int peek(int stackNum) {
    if (isEmpty(stackNum)) {
      return 0;
    }
    int val = values[indexOfTop(stackNum)];
    return val;
  }
  public boolean isEmpty(int stackNum) {
    return sizes[stackNum] == 0;
  }
  public boolean isFull(int stackNum) {
    return sizes[stackNum] == stackCapacity;
  }

  public int indexOfTop(int stackNum) {
    int offset = stackNum * stackCapacity;
    int size = sizes[stackNum];
    return offset + size - 1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int stackCap = sc.nextInt();
    FixedMultiStack fms = new FixedMultiStack(stackCap);
    fms.push(4, 0);
    fms.push(3, 1);
    fms.push(5, 2);
    System.out.println(fms.peek(2));
    sc.close();
  }
}

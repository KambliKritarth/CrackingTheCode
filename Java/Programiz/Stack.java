
public class Stack {
  
  int top, capacity;
  int arr[];

  Stack(int size) {
    arr = new int[size];
    capacity = size;
    top = -1;
  }

  void push(int val) {
    if (isFull()) {
      System.out.println("The stack is overflown ");
      System.exit(1);
    } else {
      System.out.println(" Entering element at stack " + val);
      arr[++top] = val;
    }
  }

  int pop() {
    if(isEmpty()){
      System.out.println("stack is empty you imbecile");
      System.exit(1);
    }
    return arr[top--];
  }
  Boolean isFull() {
    return top == capacity - 1;
  }
  
  Boolean isEmpty() {
    return top == -1;
  }

  void printStack() {
    System.out.println(top);
    for (int i = 0;i<=top; i++) {
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) {
    Stack stack = new Stack(5);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.pop();
    stack.printStack();
  }
}
public class Queue {
  int size = 5;
  int queue[] = new int[size];
  int front, rear;

  Queue() {
    front = -1;
    rear = -1;
  }
  Boolean isFull() {
    return (front==0&&rear==size-1);
  }
  
  void enqueue(int element) {
    if (isFull()) {
      System.out.println("The Queue is full lol");
      System.exit(1);
    } else {
      if (front == -1)
        front = 0;
      queue[++rear] = element;
    }
  }

  Boolean isEmpty() {
    return front==-1;
  }
  
  int dequeue() {
    int element;
    if (isEmpty()) {
      System.out.println("The queue is Empty");
      return -1;
    } else {
      element = queue[front];
      if (front >= rear) {
        front = -1;
        rear = -1;
      } else {
        front++;
      }
    }
    return element;
  }

  void display() {
    if (isEmpty()) {
      System.out.println("The queue is Empty");
    }
    else {
      System.out.println("The front index ->" + front);
      for (int i = front; i <= rear; i++) {
        System.out.println("Queue at " + i + " position is " + queue[i]);

      }
      System.out.println("The rear index ->" + rear);
    }
  }
  public static void main(String[] args) {
    Queue q = new Queue();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    q.enqueue(5);
    q.display();
  }
}

// Revision Test -- 30/12/2022 -- 12:41 PM

/* public class LL {
  Node head;

  static class Node {
    Node next;
    int data;

    public Node(int val) {
      next = null;
      data = val;
    }

  }

  void insertAtBeginning(int val) {
    Node new_node = new Node(val);
    new_node.next = null;
    head = new_node;
  }

  void insertAfter(Node prev_node, int val) {
    if (prev_node == null) {
      System.out.println("Prev_node can't be null");
      return;
    }
    Node new_node = new Node(val);
    new_node.next = prev_node.next;
    prev_node.next = new_node;
  }

  void insertAtEnd(int val) {
    Node new_node = new Node(val);
    if (head == null) {
      head = new Node(val);
      return;
    }
    new_node.next = null;
    Node last = head;
    while (last.next != null) {
      last = last.next;
    }
    last.next = new_node;
  }
  public static void main(String[] args) {
    
  }
} */

public class LinkedListInsert {
  Node head;

  static class Node {
    int data;
    Node next;

    public Node(int val) {
      next = null;
      data = val;
    }
  }

  void insertAtBeginning(int val) {
    Node new_node = new Node(val);
    new_node.next = head;
    head = new_node;
  }

  void insertAfter(Node prev_node, int data) {
    if (prev_node == null) {
      System.out.println("The previous null can't be null");
      return;
    }
    Node new_node = new Node(data);
    new_node.next = prev_node.next;
    prev_node.next = new_node;
  }

  void insertAtEnd(int data) {
    Node new_node = new Node(data);
    if (head == null) {
      head = new Node(data);
      return;
    }
    new_node.next = null;
    Node last = head;
    while (last.next != null) {
      last = last.next;
    }
    last.next = new_node;
  }
  void printList() {
    Node tnode = head;
    while (tnode != null) {
      System.out.print( tnode.data + "->");
      tnode = tnode.next;
    }
  }
  public static void main(String[] args) {
    LinkedListInsert ll = new LinkedListInsert();
    ll.head = new Node(2);
    ll.insertAtBeginning(6);
    ll.insertAtBeginning(9);
    ll.insertAfter(ll.head, 0);
    ll.insertAtEnd(7);
    ll.printList();
  }
}

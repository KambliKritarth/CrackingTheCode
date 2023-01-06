public class LinkedListDelete {
  Node head;

  public static class Node {
    int value;
    Node next;

    public Node(int val) {
      value = val;
      next = null;
    }
  }
  void printList() {
    Node tnode = head;
    while (tnode != null) {
      System.out.print(tnode.value + "->");
      tnode = tnode.next;
    }
  }
  void insertAtBeginning(int val) {
    if (head == null) {
      head.value = val;
      return;
    }
    Node new_node = new Node(val);
    new_node.next = head;
    head = new_node;
  }

  void insertAfter(Node prev_node, int val) {
    if (prev_node == null) {
      System.out.println("No such node exist in the LL ");
      return;
    }
    Node new_node = new Node(val);
    new_node.next = prev_node.next;
    prev_node.next = new_node;
  }

  void insertAtEnd(int val) {
    Node new_node = new Node(val);
    if (head == null) {
      head = new_node;
      return;
    }
    new_node.next = null;
    Node last = head;
    while (last.next != null) {
      last = last.next;
    }
    last.next = new_node;
  }

  void deleteAt(int position) {
    if (head == null) {
      System.out.println("No nodes");
      return;
    }
    Node temp = head;
    if (position == 0) {
      head = temp.next;
    }
    for (int i = 0; temp.next != null && i < position - 1; i++) {
      temp = temp.next;
    }
    if (temp.next == null || temp == null) {
      return;
    }
    temp.next = temp.next.next;
  }
  public static void main(String[] args) {
    LinkedListDelete ll = new LinkedListDelete();
    ll.head = new Node(2);
    ll.insertAtBeginning(6);
    ll.insertAtBeginning(9);
    ll.insertAfter(ll.head, 0);
    ll.insertAtEnd(7);
    ll.printList();
    System.out.println();
    ll.deleteAt(2);
    ll.printList();
  }
}

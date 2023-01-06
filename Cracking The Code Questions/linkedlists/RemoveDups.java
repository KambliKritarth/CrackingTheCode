import java.util.*;
class RemoveDups {
  Node head;

  static class Node {
    Node next;
    int data;

    Node(int val) {
      data = val;
      next = null;
    }
  }

  void printList() {
    Node tnode = head;
    while (tnode!= null) {
      System.out.print(tnode.data + "->");
      tnode = tnode.next;
    }
  }
  void insertAtBeginning(int val) {
    if (head == null) {
      head = new Node(val);
      return;
    }
    Node new_node = new Node(val);
    new_node.next = head;
    head = new_node;
  }

  void insertAfter(Node prev_node, int val) {
    if (prev_node == null) {
      System.out.println("No previous nodes");
      return;
    }
    Node new_node = new Node(val);
    new_node.next = prev_node.next;
    prev_node.next = new_node;
  }

  void insertAtEnd(int val) {

    if (head == null) {
      head = new Node(val);
      return;
    }
    Node new_node = new Node(val);
    new_node.next = null;
    Node last = head;
    while (last.next != null) {
      last = last.next;
    }
    last.next = new_node;
  }

  void deleteAt(int position) {
    Node temp = head;
    if (position == 0) {
      head = temp.next;
      return;
    }
    for (int i = 0; i < position - 1 && temp.next != null; i++) {
      temp = temp.next;
    }
    if (temp == null || temp.next == null) {
      return;
    }
    temp.next = temp.next.next;
  }

  void removeDups(Node rd) {
    HashSet<Integer> hs = new HashSet<Integer>();
    Node prev = null;
    while (rd != null) {
      if (hs.contains(rd.data)) {
        prev.next = rd.next;
      } else {
        hs.add(rd.data);
        prev = rd;
      }
      rd = rd.next;
    }
  }
  // Time Complexity: O(N)
  public static void main(String[] args) {
    RemoveDups ll = new RemoveDups();
    ll.head = new Node(6);
    ll.insertAtBeginning(6);
    ll.insertAtBeginning(9);
    ll.insertAfter(ll.head, 9);
    ll.insertAtEnd(6);
    ll.printList();
    System.out.println();
    ll.deleteAt(2);
    ll.printList();
    ll.removeDups(ll.head.next);
    ll.printList();
  }
}
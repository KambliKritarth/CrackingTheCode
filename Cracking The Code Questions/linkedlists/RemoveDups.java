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

  void removeDupsBuff(Node n) {
    // Time Complexity: O(N) 
    HashSet<Integer> set = new HashSet<Integer>();
    Node previous = null;
    while (n != null) {
      if (set.contains(n.data)) {
        previous.next = n.next; 
      }
      else {
        set.add(n.data);
        previous = n;
      }
      n = n.next;
    }
  }
  
  void removeDups(Node n) {
    // Time Complexity: O(1)
    Node current = head;
    while (current != null) {
      Node runner = current;
      while (runner.next != null) {
        if (current.data == runner.next.data) {
          runner.next = runner.next.next;
        }
        else {
          runner = runner.next;
        }
      }
      current = current.next;
    }
  }
  
  public static void main(String[] args) {
    RemoveDups ll = new RemoveDups();
    ll.head = new Node(2);
    ll.insertAtBeginning(6);
    ll.insertAtBeginning(9);
    ll.insertAfter(ll.head, 9);
    ll.insertAtEnd(6);
    ll.insertAtEnd(2);
    ll.printList();
    System.out.println();
    ll.deleteAt(4);
    ll.printList();
    System.out.println();
    ll.removeDups(ll.head);
    ll.printList();
  }
}
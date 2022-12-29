
public class LinkedList {
  Node head;
  
  public static class Node {
    int value;
    Node next;

    Node(int data) {
      value = data;
      next = null;
  }
  }
  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    ll.head.next = second;
    second.next = third;
    while (ll.head != null) {
      System.out.println(ll.head.value + " ");
      ll.head = ll.head.next; 
    }
  }
}
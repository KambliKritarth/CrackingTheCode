public class SumLists {
  Node head;

  public static class Node {
    int value;
    Node next;
    public Node() {
      value = 0;
      next = null;
    }
    public Node(int data) {
      value = data;
      next = null;
    }
  }

  void insertAtBeginning(int val) {
    Node newNode = new Node(val);
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  void printList() {
    Node tnode = head;
    while (tnode != null) {
      System.out.print(tnode.value + "->");
      tnode = tnode.next;
    }
  }
  void printList(Node head) {
    Node tnode = head;
    while (tnode != null) {
      System.out.print(tnode.value + "->");
      tnode = tnode.next;
    }
  }
  void insertAfter(Node prev_node,int val) {
    if (prev_node == null) {
      System.out.println("There are no previous nodes");
      return;
    }
    Node newNode = new Node(val);
    newNode.next = prev_node.next;
    prev_node.next = newNode;
  }

  void insertAtEnd(int val) {
    Node newNode = new Node(val);
    if (head == null) {
      head = newNode;
      return;
    }
    Node last = head;
    while (last.next != null) {
      last = last.next;
    }
    last.next = newNode;
  }

  Node addLists(Node l1, Node l2, int carry) {
    if (l1 == null && l2 == null && carry == 0) {
      return null;
    }
    Node result = new Node();
    int value = carry;
    if (l1 != null) {
      value += l1.value;
    }
    if (l2 != null) {
      value += l2.value;
    }
    if (l1 != null || l2 != null) {
      Node more = addLists(l1==null?null:l1.next,l2==null?null: l2.next,value>=10?1:0);
      insertAtEnd(more.value);
    }
    return result;
  }
  public static void main(String[] args) {
    SumLists ll = new SumLists();
    ll.head = new Node(7);
    ll.head.next = new Node(1);
    ll.head.next.next = new Node(6);
    SumLists ll1 = new SumLists();
    ll1.head = new Node(5);
    ll1.head.next = new Node(9);
    ll1.head.next.next = new Node(2);
    ll.printList();
    System.out.println();
    ll1.printList();
    Node sum = ll.addLists(ll.head, ll1.head, 0);
    ll.printList(sum);
    System.out.println();
    /* ll.deleteAt(2);
    ll.printList(); */
  }
}

public class IntersectionLL {
  Node head;
  Node alt;

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
  void printList(Node head) {
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

  Node findIntersection(Node l1,Node l2) {
    if (l1 == null || l2 == null)
      return null;
    Result result1 = getTailAndSize(l1);
    Result result2 = getTailAndSize(l2);
    Node shorter = result1.size < result2.size ? l1 : l2;
    Node longer = result1.size > result2.size ? l1 : l2;
    longer = getKthNode(l1, Math.abs(result1.size - result2.size));
    while (longer != shorter) {
      longer = longer.next;
      shorter = shorter.next;
    }
    return longer;
  }
  class Result {
    public Node tail;
    public int size;

    Result(Node tail, int size) {
      this.tail = tail;
      this.size = size;
    }
  }

  Result getTailAndSize(Node head) {
    if (head == null)
      return null;
    int k = 0;
    while (head != null) {
      k++;
      head = head.next;
    }
    return new Result(head,k);
  }
  Node getKthNode(Node head, int k) {
    Node current = head;
    while (current != null && k > 0) {
      current = current.next;
      k--;
    }
    return current;
  }
  public static void main(String[] args) {
    IntersectionLL ll = new IntersectionLL();
    ll.head = new Node(2);
    ll.alt = new Node(3);
    ll.insertAfter(ll.alt, 4);
    ll.insertAtEnd(7);
    ll.alt.next = ll.head.next;
    ll.insertAtEnd(8);
    ll.insertAtEnd(0);
    ll.insertAtEnd(11);
    System.out.println(ll.findIntersection(ll.head, ll.alt).value);;
    ll.printList();
    System.out.println();
    ll.printList(ll.alt);
  }
}

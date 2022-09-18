// Priority Queue implementation in Java

import java.util.ArrayList;

class Heaps {
  // Function to heapify the tree
  void heapify(ArrayList<Integer> hT, int i) {
    int size = hT.size();
    int largest = i;
    int l = 2 * i + 1;
    int r = 2 * i + 2;
    if(l<size&&hT.get(largest)<hT.get(l))
      largest = l;
    if(r<size&&hT.get(largest)<hT.get(r))
      largest = r;
    if (largest != i) {
      int temp = hT.get(largest);
      hT.set(largest,hT.get(i));
      hT.set(i,temp);
      heapify(hT, largest);
    }
  }
  void insert(ArrayList<Integer> hT, int newNum) {
    int size = hT.size();
    if (size == 0) {
      hT.add(newNum);
    }
    else {
      hT.add(newNum);
      for (int i = size/2 - 1; i >=0; i--) {
        heapify(hT,i);
      }
    }
  }
  // Function to delete an element from the tree
  void deleteNode(ArrayList<Integer> hT, int num) {
    int size = hT.size();
    int i;
    for ( i = 0; i < size - 1; i++) {
      if (hT.get(i) == num)
        break;
    }
    int temp = hT.get(i);
    hT.set(i, hT.get(size - 1));
    hT.set(size - 1, temp);
    hT.remove(size - 1);
    for (int j = size / 2 - 1;j>=0;j--)
    {
      heapify(hT, j);
    }
  }

  // Print the tree
  void printArray(ArrayList<Integer> array, int size) {
    for (Integer i : array) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  // Driver code
  public static void main(String args[]) {

    ArrayList<Integer> array = new ArrayList<Integer>();
    int size = array.size();

    Heaps h = new Heaps();
    h.insert(array, 3);
    h.printArray(array, size);
    h.insert(array, 4);
    h.printArray(array, size);
    h.insert(array, 9);
    h.printArray(array, size);
    h.insert(array, 5);
    h.printArray(array, size);
    h.insert(array, 2);
    h.printArray(array, size);

    System.out.println("Max-Heap array: ");
    h.printArray(array, size);

    h.deleteNode(array, 4);
    System.out.println("After deleting an element: ");
    h.printArray(array, size);
  }
}
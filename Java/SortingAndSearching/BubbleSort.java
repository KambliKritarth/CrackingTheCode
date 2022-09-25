import java.util.*;

class BubbleSort {
  
  static void bubbleSort(int arr[]) {
    int len = arr.length;
    int array[] = arr;
    for (int i = 0; i < len; i++) {
      for (int j = 0; j <= i; j++) {
        if (array[i] < array[j]) {
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
  }
  public static void main(String args[]) {
      
    int[] data = { -2, 45, 0, 11, -9 };
    
    // call method using class name
    BubbleSort.bubbleSort(data);
    
    System.out.println("Sorted Array in Ascending Order:");
    System.out.println(Arrays.toString(data));
  }
}
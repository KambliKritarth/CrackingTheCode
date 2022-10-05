import java.util.*;

class Sort {
  //wrong algo
  static void bubbleSort(int arr[]) {
    int len = arr.length;
    for (int i = 0; i < len; i++) {
      for (int j = 0;j<len - i -1; j++) {
        if (arr[j] > arr[j + 1]) {
          arr[j] = arr[j + 1] + arr[j];
          arr[j + 1] = arr[j] - arr[j + 1];
          arr[j] = arr[j] - arr[j + 1];
        }
      }
    }
    
  }

  static void insertionSort(int arr[]) {
    int size = arr.length;
    for (int step = 1; step < size; step++) {
      int key = arr[step];
      int j = step - 1;
      while (j >= 0 && key < arr[j]) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
  }
  static void selectionSort(int arr[]) {
    int size = arr.length;
    for (int step = 0; step < size - 1; step++) {
      int min_index = step;
      for (int i = step + 1; i < size; i++) {
        if (arr[i] < arr[min_index]) {
          min_index = i;
        }
      }
      int temp = arr[min_index];
      arr[min_index] = arr[step];
      arr[step] = temp;
    }
  }
  public static void main(String args[]) {
      
    int[] data = { -2, 45, 0, 11, -9 };
    // call method using class name
    Sort.bubbleSort(data);
    Sort.insertionSort(data);
    Sort.selectionSort(data);
    System.out.println("Sorted Array in Ascending Order:");
    System.out.println(Arrays.toString(data));
  }
}
import java.util.*;

class Sort {
  public int[] swap(int arr[], int a, int b) {
    arr[a] = arr[a]+arr[b];
    arr[b] = arr[a]-arr[b];
    arr[a] = arr[a]-arr[b];
    return arr;
  }
  //wrong algo
  static void bubbleSort(Sort s,int arr[]) {
    int len = arr.length;
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < (len - 1 - i); j++) {
        if(arr[j]>arr[j+1]){
         arr = s.swap(arr,j,j+1); 
        }
      }
      
    }
  }

  static void insertionSort(int arr[]) {
    int size = arr.length;
    for (int step = 1;step<size; step++) {
      int key = arr[step];
      int j = step - 1;
      while (j >= 0 && key < arr[j]) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j+1] = key;
    }
  }

  static void selectionSort(Sort s, int arr[]) {
    int size = arr.length;
    for (int step = 0; step < size; step++) {
      int min_index = step;
      for (int i = step + 1; i < size - 1; i++) {
        if(arr[i]<arr[min_index]){
          min_index = i;
        }
      }
      arr = s.swap(arr,step,min_index);
    }
  }

  /* static int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
      if (arr[j] <= pivot) {
        i++;
        int temp = arr[i];
        
      }
    }
  } */

  static void quickSort(int arr[],int low ,int high) {
    
  }
  public static void main(String args[]) {
      
    int[] data = { -2, 45, 0, 11, -9 };
    Sort s = new Sort();
    // call method using class name
    Scanner sc = new Scanner(System.in);
    String str = "";
    str = sc.next();
    switch (str) {
      case "Bubble":
        Sort.bubbleSort(s,data);
        break;
      case "Insertion":
        Sort.insertionSort(data);
        break;
      case "Selection":
        Sort.selectionSort(s,data);
        break;
      case "Quick":
        int size = data.length;
        Sort.quickSort(data,0,size -1);
        break;
    }
    System.out.println("Sorted Array in Ascending Order:");
    System.out.println(Arrays.toString(data));
    sc.close();
  }
}
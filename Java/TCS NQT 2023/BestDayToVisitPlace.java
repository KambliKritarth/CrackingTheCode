import java.util.*;

public class BestDayToVisitPlace {
  
  public static boolean isDecreasing(int k, int arr[], int t) {
    int flag = 0;
    for (int i = k - t; i < k; i++) {
      if(!(arr[i]>=arr[i+1]))
        flag = 1;
    }
    return flag == 0;
  }
  public static boolean isIncreasing(int k, int arr[], int t) {
    int flag = 0;
    for (int i = k; i < k + t; i++) {
      if(!(arr[i]<=arr[i+1]))
        flag = 1;
    }
    return flag == 0;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = t; i < n - t ; i++) {
      if (isIncreasing(i, arr, t) && isDecreasing(i, arr, t)) {
        System.out.print(i+" ");
      }
    }
    sc.close();
  }
}

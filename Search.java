// Linear Search and Binary Search
import java.util.Arrays;

public class Search {
  public static void main(String[] args){
    int[] example = {10, 4, 3, 2, 6, 20, 11, 15};

    int result = linearSearch(example, 15);
    System.out.println(result);


    int[] sortedarray = new int[50];
    for(int i = 0; i< sortedarray.length;i++){
      sortedarray[i] = i * 2;
    }

    int result2 = binarySearch(sortedarray, 32);
    // System.out.println(Arrays.toString(sortedarray));
    System.out.println(result2);
  }

  // for loop implementation of linear search
  public static int linearSearch(int[] arr, int q){
    for(int i = 0; i<arr.length; i++){
      if(arr[i] == q)
        return i;
    }

    return -1;
  }

  // while loop implementation of binary search
  public static int binarySearch(int[] arr, int v){
    int n = arr.length;
    int left = 0;
    int right = n-1;

    while(left <= right){
      int mid = (left + right)/2;

      if(arr[mid] == v){
        return mid;
      }

      if(v < arr[mid]){
        right = mid-1;
      } else {
        left = mid+1;
      }
    } // end while loop

    return -1;
  }

}

/* Write a program to calculate the sum of numbers from 1 to n using recursion
 */

public class Problem2 {
  static int sumOfN(int n){
    if(n == 0)
      return 0;
    else
      return n+sumOfN(n-1);

  }

  public static void main(String[] args){
    int n = 7;  // hardcoded value for now
    int sum = sumOfN(n);
    System.out.printf("The sum of numbers from 1 to %d: %d\n", n, sum);
  }

}

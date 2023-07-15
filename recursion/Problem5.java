/* Write a program to count the digits of a given number using recursion.
 */

import java.util.Scanner;

public class Problem5 {
  static int count = 0;

  static int countDigits(int n){
    if(n!=0){
      count++;
      countDigits(n/10); // divide by 10 until n equals 0
    }
    return count;
  }
  
  public static void main(String[] args){
    System.out.print("Input a number:");
    Scanner in = new Scanner(System.in);
    int input = in.nextInt();
    int digits = countDigits(input);
    System.out.println("The number of digits in the number is:" + digits);
  }

}

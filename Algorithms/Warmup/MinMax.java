/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
https://www.hackerrank.com/challenges/mini-max-sum
Input Format

A single line of five space-separated integers.

Constraints

Each integer is in the inclusive range .
Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

Our initial numbers are , , , , and . We can calculate the following sums using four of the five integers:

If we sum everything except , our sum is .
If we sum everything except , our sum is .
If we sum everything except , our sum is .
If we sum everything except , our sum is .
If we sum everything except , our sum is .
As you can see, the minimal sum is  and the maximal sum is . Thus, we print these minimal and maximal sums as two space-separated integers on a new line.

Hints: Beware of integer overflow! Use 64-bit Integer.
 */


/**
 * This passes all the tests
 */
 import java.util.*;

 public class Solution {

     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         long sum = 0L;
         long min = 1000000000;
         long max = 0L;
         while(scan.hasNext()) {
             long num = scan.nextLong();
             sum = sum + num;
             if (min > num)
                 min = num;

             if (max < num)
                 max = num;

         }
         scan.close();

         System.out.println((sum - max) + " " + (sum - min));
     }
 }


//Solution 2
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5]; long[]sum = new long[5];

        for(int arr_i=0; arr_i < 5; arr_i++)
            arr[arr_i] = in.nextLong();


        for(int i=0;i<5;i++)
            sum[i]=sumAllExcept(i,arr);
        printMinMaxValues(sum);
     }

    private static long sumAllExcept(long i,long[] a){
       long sum=0;
        for(int j=0;j<a.length;j++){
            if(i==j)
                continue;
            sum+=a[j];
        }
        return sum;
     }

     private static void printMinMaxValues(long[] a){
       long max=a[0], min=a[0];
        for(int j=0;j<a.length;j++){
            if(a[j]>max)
                max=a[j];

            if(a[j]<max)
                min=a[j];
      }
         System.out.println(min+ " " +max);
   }
}

/**
 * Check out the resources on the page's right side to learn more about arrays. The video tutorial is by Gayle Laakmann McDowell, author of the best-selling interview book Cracking the Coding Interview.
A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. For example, if left rotations are performed on array , then the array would become .

https://www.hackerrank.com/challenges/ctci-array-left-rotation
Given an array of  integers and a number, , perform  left rotations on the array. Then print the updated array as a single line of space-separated integers.

Input Format

The first line contains two space-separated integers denoting the respective values of  (the number of integers) and  (the number of left rotations you must perform).
The second line contains  space-separated integers describing the respective elements of the array's initial state.

Constraints

Output Format

Print a single line of  space-separated integers denoting the final state of the array after performing  left rotations.

Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4
Explanation

When we perform  left rotations, the array undergoes the following sequence of changes:

Thus, we print the array's final state as a single line of space-separated values, which is 5 1 2 3 4.
 */

 import java.io.*;
 import java.util.*;
 import java.text.*;
 import java.math.*;
 import java.util.regex.*;

 public class Solution {

     public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int temp=0,counter=0;

         while(counter<k){
            temp=a[0];
         for(int i=0;i<n-1;i++)
             a[i]=a[i+1];
         a[a.length-1]=temp;
         counter++;
        }
       return a;
     }

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int k = in.nextInt();
         int a[] = new int[n];
         for(int a_i=0; a_i < n; a_i++){
             a[a_i] = in.nextInt();
         }

         int[] output = new int[n];
         output = arrayLeftRotation(a, n, k);
         for(int i = 0; i < n; i++)
             System.out.print(output[i] + " ");

         System.out.println();

     }
 }

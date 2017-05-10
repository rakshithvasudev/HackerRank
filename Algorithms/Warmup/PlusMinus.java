/**
 * Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.
https://www.hackerrank.com/challenges/plus-minus?
Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Input Format

The first line contains an integer, , denoting the size of the array.
The second line contains  space-separated integers describing an array of numbers .

Output Format

You must print the following  lines:

A decimal representing of the fraction of positive numbers in the array compared to its size.
A decimal representing of the fraction of negative numbers in the array compared to its size.
A decimal representing of the fraction of zeroes in the array compared to its size.
Sample Input

6
-4 3 -9 0 4 1
Sample Output

0.500000
0.333333
0.166667
Explanation

There are  positive numbers,  negative numbers, and  zero in the array.
The respective fractions of positive numbers, negative numbers and zeroes are ,  and , respectively.
 */

 import java.io.*;
 import java.util.*;
 import java.text.*;
 import java.math.*;
 import java.util.regex.*;

 public class Solution {

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt(), negative=0,zero=0,positive=0;
         int arr[] = new int[n];
         for(int arr_i=0; arr_i < n; arr_i++){
             arr[arr_i] = in.nextInt();
             if(arr[arr_i]>0)
                 positive++;
             else if(arr[arr_i]==0)
                 zero++;
             else
                 negative++;

         }
           System.out.println(positive/(double)n);
           System.out.println(negative/(double)n);
           System.out.println(zero/(double)n);
     }
 }

/**
 * Given a square matrix of size , calculate the absolute difference between the sums of its diagonals.
https://www.hackerrank.com/challenges/diagonal-difference
Input Format

The first line contains a single integer, . The next  lines denote the matrix's rows, with each line containing space-separated integers describing the columns.

Constraints

Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output

15
Explanation

The primary diagonal is:

11
   5
     -12
Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:

     4
   5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15
 */

 import java.io.*;
 import java.util.*;
 import java.text.*;
 import java.math.*;
 import java.util.regex.*;

 public class Solution {

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt(),sum1=0,sum2=0;
         int a[][] = new int[n][n];
         for(int a_i=0; a_i < n; a_i++){
             for(int a_j=0; a_j < n; a_j++){
                 a[a_i][a_j] = in.nextInt();
                 if(a_i==a_j)
                     sum1+=a[a_i][a_j];

                 //a[0][2]+a[1][1]+a[2][0]
                 //This part taken from discussions.
                 if(a_i+a_j==n-1)
                     sum2+=a[a_i][a_j];
            }
         }
         System.out.print(Math.abs(sum1-sum2));
     }
 }

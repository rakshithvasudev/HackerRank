/**
 * Colleen is turning  years old! She has  candles of various heights on her cake, and candle  has height . Because the taller candles tower over the shorter ones, Colleen can only blow out the tallest candles.

Given the  for each individual candle, find and print the number of candles she can successfully blow out.

Input Format

The first line contains a single integer, , denoting the number of candles on the cake.
The second line contains  space-separated integers, where each integer  describes the height of candle .

Constraints

Output Format

Print the number of candles Colleen blows out on a new line.

Sample Input 0

4
3 2 1 3
Sample Output 0

2
Explanation 0

We have one candle of height , one candle of height , and two candles of height . Colleen only blows out the tallest candles, meaning the candles where . Because there are  such candles, we print  on a new line.
 */



 import java.io.*;
 import java.util.*;
 import java.text.*;
 import java.math.*;
 import java.util.regex.*;

 public class Solution {

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt(),max=0,count=0;
         int height[] = new int[n];
         for(int height_i=0; height_i < n; height_i++){
             height[height_i] = in.nextInt();
             if(height[height_i]>max)
                 max =  height[height_i];
         }
         for(int element:height)
             if(element==max)
                 count++;
         System.out.println(count);
     }
 }

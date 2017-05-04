/**
 *
 https://www.hackerrank.com/challenges/java-static-initializer-block?h_r=next-challenge&h_v=zen

 * Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it here.

You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth  and height . You should read the variables from the standard input.

If  or  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

Input Format

There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

Constraints

Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

 *
 *
 */


 import java.io.*;
 import java.util.*;
 import java.text.*;
 import java.math.*;
 import java.util.regex.*;

 public class Solution {
   private static Scanner scan = new Scanner(System.in);
   private static int B = scan.nextInt();
   private static int H = scan.nextInt();
   //Area Can Be Computed flag.
   private static boolean flag = flagInitialize();

   public static boolean flagInitialize(){
      if(B>0 && H>0)
          return true;
          //Not the best way to get the job done!
           System.out.print("java.lang.Exception: Breadth and height must be positive");
       return false;
   }
 }


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}

	}//end of main

}//end of class

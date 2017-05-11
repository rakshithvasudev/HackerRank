/**
Given a time in -hour AM/PM format, convert it to military (-hour) time.
https://www.hackerrank.com/challenges/time-conversion
Note: Midnight is  on a -hour clock, and  on a -hour clock. Noon is  on a -hour clock, and  on a -hour clock.

Input Format

A single string containing a time in -hour clock format (i.e.:  or ), where  and .

Output Format

Convert and print the given time in -hour format, where .

Sample Input

07:05:45PM
Sample Output

19:05:45
 *
 *
 */
 import java.io.*;
 import java.util.*;
 import java.text.*;
 import java.math.*;
 import java.util.regex.*;

 public class Solution {

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in).useDelimiter(":");
         int hh = Integer.parseInt(in.next());
         int mm = Integer.parseInt(in.next());
         String secsAndPM = in.next();
         int ss = Integer.parseInt(secsAndPM.substring(0,2));
         boolean isPM  = ((secsAndPM.charAt(2)=='P')?true:false);

         if(isPM && hh!=12)
             hh+=12;
         if(isPM && hh!=12)
             hh=0;   


         System.out.println(String.format("%02d",hh)+":"+ String.format("%02d",mm) +":"+ String.format("%02d",ss));

     }
 }

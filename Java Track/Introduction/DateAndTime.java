/*

 https://www.hackerrank.com/challenges/java-date-and-time
The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.


You are given a date. Your task is to find what the day is on that date.

Input Format

A single line of input containing the space separated month, day and year, respectively, in   format.

Constraints

Output Format

Output the correct day in capital letters.

Sample Input

08 05 2015
Sample Output

WEDNESDAY
Explanation

The day on August th  was WEDNESDAY.
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int month = in.nextInt();
        int date = in.nextInt();
        int year = in.nextInt();
        int day;

        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month-1,date);
        day = calendar.get(Calendar.DAY_OF_WEEK);


        printDay(day);

    }

    public static void printDay(int dayCount){
          if(dayCount==1)
            System.out.println("SUNDAY");
         if(dayCount==2)
            System.out.println("MONDAY");
         if(dayCount==3)
            System.out.println("TUESDAY");
          if(dayCount==4)
            System.out.println("WEDNESDAY");
         if(dayCount==5)
            System.out.println("THURSDAY");
         if(dayCount==6)
            System.out.println("FRIDAY");
         if(dayCount==7)
            System.out.println("SATURDAY");
    }
}

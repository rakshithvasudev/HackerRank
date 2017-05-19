/**
 * A flock of  birds is flying across the continent. Each bird has a type, and the different types are designated by the ID numbers , , , , and .
https://www.hackerrank.com/challenges/migratory-birds
Given an array of  integers where each integer describes the type of a bird in the flock, find and print the type number of the most common bird. If two or more types of birds are equally common, choose the type with the smallest ID number.

Input Format

The first line contains an integer denoting  (the number of birds).
The second line contains  space-separated integers describing the respective type numbers of each bird in the flock.

Constraints

It is guaranteed that each type is , , , , or .
Output Format

Print the type number of the most common bird; if two or more types of birds are equally common, choose the type with the smallest ID number.

Sample Input 0

6
1 4 4 4 5 3
Sample Output 0

4
Explanation 0

The different types of birds occur in the following frequencies:

Type :  bird
Type :  birds
Type :  bird
Type :  birds
Type :  bird
The type number that occurs at the highest frequency is type , so we print  as our answer.
 */

//option 1
 import java.io.*;
 import java.util.*;
 import java.text.*;
 import java.math.*;
 import java.util.regex.*;

 public class Solution {

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         Map<Integer,Integer> valuesContainer = new HashMap<>();
         int n = in.nextInt();
         int[] types = new int[n];
         for(int types_i=0; types_i < n; types_i++){
             types[types_i] = in.nextInt();
             if(!valuesContainer.containsKey(types[types_i]))
                 valuesContainer.put(types[types_i],1);
              if(valuesContainer.containsKey(types[types_i]))
                 valuesContainer.put(types[types_i],valuesContainer.get(types[types_i])+1);
         }

         Iterator it = valuesContainer.entrySet().iterator();
         int maxKey = 0 , maxValue = 0;
         Map<Integer, Integer> result = new HashMap<>();
         while(it.hasNext()){
             Map.Entry<Integer, Integer> mapentry =(Map.Entry<Integer, Integer>)it.next();
              if(mapentry.getValue() == maxValue && mapentry.getKey()<maxKey){
                     maxValue = mapentry.getValue();
                     maxKey = mapentry.getKey();
                 }else if(mapentry.getValue()> maxValue){
                      maxValue = mapentry.getValue();
                      maxKey = mapentry.getKey();
                 }

         }
          System.out.print(valuesContainer.get(maxKey));
     }

 }



//option 2
//

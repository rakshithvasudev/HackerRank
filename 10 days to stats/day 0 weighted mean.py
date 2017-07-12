'''
Problem
Submissions
Leaderboard
Discussions
Editorial 
Tutorial
Objective 
In the previous challenge, we calculated a mean. In this challenge, we practice calculating a weighted mean. Check out the Tutorial tab for learning materials and an instructional video!

Task 
Given an array, , of  integers and an array, , representing the respective weights of 's elements, calculate and print the weighted mean of 's elements. Your answer should be rounded to a scale of  decimal place (i.e.,  format).

Input Format

The first line contains an integer, , denoting the number of elements in arrays  and . 
The second line contains  space-separated integers describing the respective elements of array . 
The third line contains  space-separated integers describing the respective elements of array .

Constraints

, where  is the  element of array .
, where  is the  element of array .
Output Format

Print the weighted mean on a new line. Your answer should be rounded to a scale of  decimal place (i.e., format).

Sample Input

5
10 40 30 50 20
1 2 3 4 5
Sample Output

32.0
Explanation

We use the following formula to calculate the weighted mean:

And then print our result to a scale of  decimal place () on a new line.

'''

N = int(input())
list1 = input().strip().split()
list1 = list(map(int,list1))
list2 = input().strip().split()
list2 = list(map(int,list2))

sum_ele = 0
sum_dr = 0
for index in range(len(list1)):
    sum_ele += list1[index]*list2[index]
    sum_dr += list2[index]
    
print(round(sum_ele/sum_dr,1))    
    
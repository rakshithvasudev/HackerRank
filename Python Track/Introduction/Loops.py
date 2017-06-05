"""
Task 
Read an integer . For all non-negative integers , print . See the sample for details.

Input Format

The first and only line contains the integer, .

Constraints


Output Format

Print  lines, one corresponding to each .

Sample Input

5
Sample Output

0
1
4
9
16
"""
if __name__ == '__main__':
    n = int(input())
    for x in range(0,n):
        print(x**2)
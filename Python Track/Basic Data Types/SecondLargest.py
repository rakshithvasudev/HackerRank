'''
Find the Second Largest Number
You are given  numbers. Store them in a list and find the second largest number.

Input Format 
The first line contains . The second line contains an array [] of  integers each separated by a space.

Constraints 
 

Output Format 
Output the value of the second largest number.

Sample Input

5
2 3 6 6 5
Sample Output

5
'''

# not the best way
if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    arr = list(arr)
    arr.sort(reverse=True)
    max = arr[0]
    i = 1
    while arr[i] == max:
        i += 1

    print(arr[i])

# optimal way
if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    v = max(arr)
    while v == max(arr):
        arr.remove(max(arr))
    print(max(arr))

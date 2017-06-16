
'''
There will also be some challenges where you'll get to apply what you've learnt.

About the Challenges 
The challenges will describe some topic and then ask you to code a solution. As you progress through the challenges, you will learn some important concepts in algorithms. In each challenge, you will receive input on STDIN and you will need to print the correct output to STDOUT.

For many challenges, helper methods (like an array) will be provided for you to process the input into a useful format. You can use these methods to get started with your program, or you can write your own input methods if you want. Your code just needs to print the right output to each test case.

Sample Challenge 
This is a simple challenge to get things started. Given a sorted array () and a number (), can you print the index location of  in the array?

The next section describes the input format. You can often skip it, if you are using included methods.

Input Format 
There will be three lines of input:

 - the value that has to be searched.
 - the size of the array.
 -  numbers that make up the array.
Output Format 
Output the index of  in the array.

The next section describes the constraints and ranges of the input. You should check this section to know the range of the input.

Constraints

It is guaranteed that  will occur in  exactly once.
This "sample" shows the first input test case. It is often useful to go through the sample to understand a challenge.

Sample Input

4
6
1 4 5 7 9 12
Sample Output

1
Explanation 
. The value  is the nd element in the array, but its index is  since array indices start from , so the answer is .
'''



searchElement = int(input().strip())
size = int(input())
numbers = input().split(" ")
numbers = list(map(int,numbers))


# added binary search for practise. Also the list is ordered. 
# this could be an indicator for something.

def binSearch(arr,ele,low,high):
    if len(arr)==0:
        return -1
    
    mid = (low+high)//2
    
    if  ele == arr[mid]:
        return mid
    elif  ele < arr[mid] :
        return binSearch(arr,ele,low,mid)    
    else:
        return binSearch(arr,ele,mid+1,high)

 

    
print(binSearch(numbers,searchElement,0,len(numbers)-1))
 
/**
 * Professor GukiZ has hobby — constructing different arrays. His best student, Nenad, gave him the following task that he just can't manage to solve:
https://www.hackerrank.com/challenges/array-constructions
Construct an -element array, , where the sum of all elements is equal to  and the sum of absolute differences between each pair of elements is equal to . All elements in  must be non-negative integers.

If there is more then one such array, you need to find the lexicographically smallest one. In the case no such array exists, print .

Note: An array, , is considered to be lexicographically smaller than another array, , if there is an index  such that  and, for any index , .

Input Format

The first line contains an integer, , denoting the number of queries.
Each of the  subsequent lines contains three space-separated integers describing the respective values of  (the number of elements in array ),  (the sum of elements in ), and  (the sum of absolute differences between each pair of elements).

Constraints

Subtasks

For  of the maximum score:

For  of the maximum score:

Output Format

For each query, print  space-separated integers describing the respective elements of the lexicographically smallest array  satisfying the conditions given above. If no such array exists, print  instead.
 */

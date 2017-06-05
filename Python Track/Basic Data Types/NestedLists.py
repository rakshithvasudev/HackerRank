'''
Given the names and grades for each student in a Physics class of  students, store them in a nested list and print the name(s) of any student(s) having the second lowest grade.

Note: If there are multiple students with the same grade, order their names alphabetically and print each name on a new line.

Input Format

The first line contains an integer, , the number of students. 
The  subsequent lines describe each student over  lines; the first line contains a student's name, and the second line contains their grade.

Constraints

There will always be one or more students having the second lowest grade.
Output Format

Print the name(s) of any student(s) having the second lowest grade in Physics; if there are multiple students, order their names alphabetically and print each one on a new line.

Sample Input

5
Harry
37.21
Berry
37.21
Tina
37.2
Akriti
41
Harsh
39
Sample Output

Berry
Harry
Explanation

There are  students in this class whose names and grades are assembled to build the following list:

students = [['Harry', 37.21], ['Berry', 37.21], ['Tina', 37.2], ['Akriti', 41], ['Harsh', 39]]
The lowest grade of  belongs to Tina. The second lowest grade of  belongs to both Harry and Berry, so we order their names alphabetically and print each name on a new line.
'''

if __name__ == '__main__':
    students = []
    sortedNames = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        students.append([name, score])
    # trying to implement without sort
    # students = sorted(students,key=lambda students:students[1])

    # get the least valued element
    minVal = min(students, key=lambda students: students[1])

    # if there are more than one min valued elements, delete them
    # as long as the previously min element defined == the actual least element
    while minVal == min(students, key=lambda students: students[1]):
        students.remove(min(students, key=lambda students: students[1]))

    # capture the value of that element
    valueReq = min(students, key=lambda students: students[1])[1]

    # print the name of second lowest element(required)
    # print(min(students, key = lambda students:students[1])[0])
    sortedNames.append(min(students, key=lambda students: students[1])[0])
    students.remove(min(students, key=lambda students: students[1]))

    # print all the required elements, i.e delete the already printed element
    while (valueReq == min(students, key=lambda students: students[1])[1]):
        # print(min(students, key = lambda students:students[1])[0])
        sortedNames.append(min(students, key=lambda students: students[1])[0])
        students.remove(min(students, key=lambda students: students[1]))

    sortedNames.sort()

    for name in sortedNames:
        print(name)
"""
Given an array a that contains only numbers in the range from 1 to a.length,
find the first duplicate number for which the second occurrence has the minimal index. In other words, if there are more than 1 duplicated numbers, return the number for which the second occurrence has a smaller index than the second occurrence of the other number does. 
If there are no such elements, return -1.
"""
def firstDuplicate(a): 
    duplicates = {}
    idxvals = []
    for i in range(len(a)):
        if a[i] not in duplicates:
            duplicates[a[i]] = []
        duplicates[a[i]].append(i)
    
    flag = -1
    
    for key, value in duplicates.items():
        if len(value) > 1:
            idxvals.append((key,value[1]))
            flag = 1
    
    if flag ==-1:
        return flag
        
    idxvals = sorted(idxvals,key=lambda x:x[1])    
    print(idxvals)
    return idxvals[0][0]
            
    
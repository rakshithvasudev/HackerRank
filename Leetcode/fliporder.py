def flip(arr,k):
    """
    Reverses the k elements of the arr inplace.
    """
    idx = 0
    end = k-1

    while idx <= end:
        temp = arr[idx] 
        arr[idx] = arr[end]
        arr[end] = temp
        end-=1
        idx+=1
    return arr


def cakesort(arr):
    last_idx = len(arr)-1
    start = 0
    end = last_idx  
    
    if max(arr)!=last_idx
        arr[last_idx] = max(arr)

    while()






# [5,2,4,19] -> [2,5,4,19]-> [5,2,4,19]->[5,2,4,19]->[4,2,5,19]->[2,4,5,19] 
cakesort([5,2,4,19])
# sample = [1,2,3,4,5,6,7,8,9]
# for i in range(1,len(sample)+1):
#     print("iteration %s = %s" % (i, flip(sample[:],i)))

    
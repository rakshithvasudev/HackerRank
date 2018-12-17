def reverseinplace(arr):
    start = 0
    end = len(arr)-1

    while(start <= end):
        temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start+=1
        end-=1
    return arr

def reverseWords(arr):
    start = 0
    end = len(arr)-1
    blank = 0
    idx = 0
    
    while(idx<=end):
        if arr[idx] == ' ':
            blank = idx
            arr[start:blank] = reverseinplace(arr[start:blank])
            start = blank+1
        
        elif idx == end:
            arr[start:] = reverseinplace(arr[start:])
        idx+=1
    return arr


sample = ['c','l','e','a','r',' ','i','s',' ','f','u','n']  # must return ['f', 'u', 'n', ' ', 'i', 's', ' ', 'c', 'l', 'e', 'a', 'r']
reversed_all = reverseinplace(sample)
print(reverseWords(reversed_all))
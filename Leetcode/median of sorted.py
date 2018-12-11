def computeMedian(arr):
    length = len(arr)

    if length % 2 == 0:
        return (arr[int((length/2)-1)]+arr[int((length/2)+1)])/2 
    
    elif length % 2 != 0: 
        return arr[int((length+1)/2)]

def findMedianSortedArrays(nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        
        i = 0
        j = 0
        sorted_array = []
        
        while(i<len(nums1) and j <len(nums2)):
            print("Inside big while")
            if nums1[i] < nums2[j]:
                sorted_array.append(nums1[i])
                i+=1
            else:
                sorted_array.append(nums2[j])
                j+=1
                    
        while(i<len(nums1)):
            print("Inside small while1")
            sorted_array.append(nums1[i])
            i+=1
            
        while(j<len(nums2)):
            print("Inside small while2")
            sorted_array.append(nums2[j])
            j+=1
        return computeMedian(sorted_array)

print(findMedianSortedArrays([2,4,5,19,20],[5,7,9]))
print(findMedianSortedArrays([2,4,5,19],[5,7,9]))
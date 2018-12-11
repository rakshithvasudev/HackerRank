def intersect(nums1, nums2):
    """
    :type nums1: List[int]
    :type nums2: List[int]
    :rtype: List[int]
    """
    
    intersection = {}
    listElement = []
    
    for num in nums1:
        if num not in intersection:
            intersection[num] = 0
        intersection[num] += 1 

    for num in nums2:
        if num in intersection:
            if intersection[num]>0:
                intersection[num]-=1
                listElement.append(num)
            else:
                del intersection[num]
    
    return listElement
           

intersect([1,2,2,1],[2,2,2,2])
intersect([1,2,3,3,2,1],[3,2,6,7])
intersect([1,2,3,3,2,1],[4,4,1])

 
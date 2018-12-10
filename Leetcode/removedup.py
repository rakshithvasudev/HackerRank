def removeDuplicates(nums):
    """
    :type nums: List[int]
    :rtype: int
    """
    
    
    unq = 0
    for idx in range(len(nums)-1):
        if nums[idx] != nums[idx+1]:
            nums[unq] = nums[idx]
            unq+=1
    nums[unq] = nums[-1]
    return unq+1, nums
print(removeDuplicates([1,2,2,3,3]))

# print(removeDuplicates([1,2,5,5]))
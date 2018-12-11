def moveZeroes(nums):
    """
    :type nums: List[int]
    :rtype: void Do not return anything, modify nums in-place instead.
    """
    
    j = 0
    for idx in range(len(nums)-1):
        if nums[idx] == 0:
            while(j<len(nums)-1):
                nums[j] = nums[j+1]
                j+=1
            nums[-1] = 0
    return nums

print(moveZeroes([1,0,2,0,3,4,5]))
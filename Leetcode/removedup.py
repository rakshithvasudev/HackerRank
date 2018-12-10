def removeDuplicates(nums):
    """
    :type nums: List[int]
    :rtype: int
    """
    
    # keeps a track of all the unique indices
    unq = 0
    for idx in range(len(nums)-1):
        if nums[idx] != nums[idx+1]:
            
            # replace current numbers with unique indices so that there isn't any duplicates: replace the last occurance of the duplicated element with the
            # first occurance of the same duplicated element
            # ex: [1,2,2,2,3,4] => 2 in index 3 replaces 2 in index 1.
            # j keeps a track of that index 1 and idx keeps a track of index 3.   
            nums[unq] = nums[idx]
            
            unq+=1

    nums[unq] = nums[-1]
    return unq+1, nums
print(removeDuplicates([1,2,2,3,3]))

# print(removeDuplicates([1,2,5,5]))
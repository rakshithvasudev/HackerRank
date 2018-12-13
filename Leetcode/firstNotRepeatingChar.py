"""
Example

For s = "abacabad", the output should be
firstNotRepeatingCharacter(s) = 'c'.

There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.

For s = "abacabaabacaba", the output should be
firstNotRepeatingCharacter(s) = '_'.

There are no characters in this string that do not repeat.

Input/Output

[execution time limit] 4 seconds (py3)

[input] string s

A string that contains only lowercase English letters.

Guaranteed constraints:
1 ≤ s.length ≤ 105.

[output] char

The first non-repeating character in s, or '_' if there are no characters that do not repeat.
"""
def firstNotRepeatingCharacter(s):
    
    if len(s) == 1:
        return s
    
    # [idx, count]
    non_repeating = {}
    
    # repeating character 
    flag = 0
    
    # iterate through the string to keep a track of the index and the counts of character occurance.
    for i in range(len(s)):
        if s[i] not in non_repeating:
            non_repeating[s[i]] = [0,0]
            old_idx  = non_repeating[s[i]][0]
            
            # handles repeated number of updates, keeps the minimum.
            new_idx = i
            if old_idx != 0:
                new_idx = min(old_idx,i)
            
        non_repeating[s[i]] = [new_idx, non_repeating[s[i]][1]+1]
    
    # delete those characters that are having counts > 1
    for char in s:
        if char in non_repeating:
            if non_repeating[char][1] > 1:
                del non_repeating[char]
                flag = 1
    
    
    sort_values = sorted(non_repeating.items(), key = lambda x : x[1])
    
    print(sort_values)
    
    if flag == 1:
        for char_value in sort_values[:1]:
            return char_value[0]        
    
    return '_'


print(firstNotRepeatingCharacter("bcccccccccccccyb"))
print(firstNotRepeatingCharacter("ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof"))
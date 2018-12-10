def lengthOfLongestSubstring(s):
        """
        :type s: str
        :rtype: int
        """
        # keeps a track of all the characters and their latest seen indices
        seen = {}
        
        # starting point - updates only if there is a second match for the given character at hand- slow update.
        start = 0
        
        # incremental pointer - fast update.
        end = 0
        
        # max length of the non repeatable substrings. 
        max_length = 0

        while(end<len(s)):
            # if the character is already seen, then update its start.
            if s[end] in seen:
                start = max(start,seen[s[end]]+1)
            
            # add/update the character to the seen dict.
            seen[s[end]]=end
            
            # update the max length of the substring
            max_length = max(max_length,end-start+1)
            
            end+=1
        return max_length 
         


print(lengthOfLongestSubstring("abcdefababab"))

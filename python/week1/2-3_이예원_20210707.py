def longestCommonPrefix(strs):
    lcp = ""
        
    for i in range(len(strs[0])):
        tmp = strs[0][i]
            
        for j in range(1, len(strs)):
            if len(strs[j]) == i:
                return lcp
            if tmp != strs[j][i]: 
                return lcp
        else:
            lcp+=tmp
    else:
        return lcp

print(longestCommonPrefix(["flower","flow","flight"]))

def findContentChildren(g, s):
    count = 0
        
    for i in range(len(s)):
        for j in range(len(g)):
            if s[i] == g[j]:
                count += 1
                g.pop(j)#이미 할당된외 자녀는 제외 
                break
                
    return count

print("[1,2,3],[1,1] --> ", findContentChildren([1,2,3],[1,1]))
print("[1,2],[1,2,3] --> ", findContentChildren([1,2],[1,2,3]))

def checkRecord (s):
    s_list = list(s)
    
    if s_list.count("A") > 2:
        return False

    count_L = s_list.count("L") # count the total num of L
    if count_L < 3:
        return True

    list_L = [] ##store the L's indexes
    for i in range(count_L):
        idx = s_list.index("L")
        list_L.append(idx+len(list_L)) #L을 지워서 계속 
        s_list.pop(idx)
    
    for i in range(len(list_L)-2):
        if list_L[i]+2 == list_L[i+1]+1 == list_L[i+2]:
            return False

    return True
    
print(checkRecord("PPALLP"))
print(checkRecord("PPALLL"))

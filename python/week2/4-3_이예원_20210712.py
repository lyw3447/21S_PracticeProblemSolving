#https://www.acmicpc.net/problem/3052

numlist = []
duplicate = 0

for i in range(10):
    num = int(input())
    num = num%42

    if numlist.count(num) == 0:
        numlist.append(num)
        
    else:
        duplicate += 1
    
print(10-duplicate)

'''
39
40
41
42
43
44
82
83
84
85
'''

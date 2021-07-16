#https://www.acmicpc.net/problem/5598

line = input()

caser = "DEFGHIJKLMNOPQRSTUVWXYZABC"
result = ""

for i in range(len(line)):
    idx = caser.find(line[i])-3
    result += caser[idx]
    
print(result)

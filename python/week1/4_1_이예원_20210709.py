# https://www.acmicpc.net/problem/2953

sums = []
largest = 0

for i in range(5):
    line = input().split()
    sums.append(0)
    
    for j in range(len(line)):
        sums[i] += int(line[j])

    if sums[largest] < sums[i]:
        largest = i
        
print(largest+1, sums[largest])






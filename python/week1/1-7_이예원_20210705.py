zero = ["....", "....", "....", "...."]
one = ["****", "....", "....", "...."]
half = ["****", "****", "....", "...."]
three = ["****", "****", "****", "...."]
full = ["****", "****", "****", "****"]

arr = []
result = []

m, n = map(int, input().split())


while len(arr) != 5*m+1:
    arr.append(input())

for i in range(m):
    for j in range(n):
        tmp = []
        tmp.append(arr[(5*i)+1][(5*j)+1:(5*j)+5]) 
        tmp.append(arr[(5*i)+2][(5*j)+1:(5*j)+5]) 
        tmp.append(arr[(5*i)+3][(5*j)+1:(5*j)+5]) 
        tmp.append(arr[(5*i)+4][(5*j)+1:(5*j)+5]) 
        result.append(tmp)

print(result.count(zero), result.count(one), result.count(half), result.count(three), result.count(full))

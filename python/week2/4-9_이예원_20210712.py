# https://www.acmicpc.net/problem/1476

e, s, m = map(int, input().split())
count = 1
i, j, k = 1, 1, 1

while True:
    if i == e and j == s and k == m:
        print(count)
        break
    i+=1
    j+=1
    k+=1
    count+=1

    if i > 15:
        i = 1
    if j > 28:
        j = 1
    if k > 19:
        k = 1

# 1 2 3 --> 5266
# 1 16 16 --> 16



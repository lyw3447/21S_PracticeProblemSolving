#https://www.acmicpc.net/problem/5355

n = int(input())

for _ in range(n):
    line = list(map(str, input().split()))

    num = float(line[0])

    for i in range(1, len(line)):
        if line[i] == '@':
            num *= 3
        elif line[i] == '%':
            num += 5
        elif line[i] == '#':
            num -= 7
    print("%0.2f" % num)

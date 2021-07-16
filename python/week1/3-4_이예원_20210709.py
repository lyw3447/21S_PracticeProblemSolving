#https://www.acmicpc.net/problem/17210

doors = int(input())
num = int(input()) # 0: push 1: pull

if doors > 5:
    print("Love is open door")

else:
    for i in range(1, doors):
        print((num+i)%2)

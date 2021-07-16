#https://www.acmicpc.net/problem/2775

def recursion(floor, room):
    if floor == 0:
        return room
    else:
        total = 0
        for i in range(1, room+1):
            total += recursion(floor-1, i)
        return total

testcase = int(input())
results = []

for i in range(testcase):
    floor = int(input())
    room = int(input())
    results.append(recursion(floor, room))

for result in results:
    print(result)

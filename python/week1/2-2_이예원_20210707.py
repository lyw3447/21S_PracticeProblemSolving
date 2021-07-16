num = int(input())

for i in range(num):
    line = input()
    boost = 1
    total = 0

    for ch in line:
        if ch == "O":
            total += boost
            boost += 1
        elif ch == "X":
            boost = 1

    print(total)
        

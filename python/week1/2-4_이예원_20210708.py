dial = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']
word = input()
total = 0

for j in range(len(word)):
    for i in dial:
        if a[j] in i:
            total += dial.index(i)+3
            break
print(total)

num = int(input())
names = {}

for i in range(num):
    name = input()
    if name[0] not in names:
        names[name[0]] = 0
    names[name[0]] += 1

result = ""
for name in names:
    if names[name] >= 5:
        result += name

if result == "":
    print("PREDAJA")
else:
    print(result)

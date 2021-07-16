n = int(input())

for _ in range(n):
    num = list(map(int, input().split()))
    avg = sum(num[1:])/num[0]

    count = 0
    for score in num[1:]:
        if score > avg:
            count += 1

    print(f'{count/num[0]*100:.3f}%')

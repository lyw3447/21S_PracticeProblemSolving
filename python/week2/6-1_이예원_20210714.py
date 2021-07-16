#https://www.acmicpc.net/problem/2164

import collections

a = int(input())
n = collections.deque([i for i in range(1, a+1)])

while len(n) > 1:
    n.popleft()  # 왼쪽 요소 제거
    n.rotate(-1) # 왼쪽으로 한바퀴 돌리기

print(n[0])
        

#https://programmers.co.kr/learn/courses/30/lessons/12977
#https://velog.io/@insutance/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4Python-%EC%86%8C%EC%88%98-%EB%A7%8C%EB%93%A4%EA%B8%B0

from itertools import combinations

def solution(nums):
    answer = 0

    cmbs = list(combinations(nums,3))
    for cmb in cmbs:
        total = sum(cmb)
        
        for i in range(2, total//2+1):
            if total%i == 0:
                break
        else:
            answer += 1

    return answer

print(solution([1, 2, 3, 4]))

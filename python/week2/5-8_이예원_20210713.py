# https://programmers.co.kr/learn/courses/30/lessons/77884

def solution(left, right):
    answer = 0
    
    for i in range(left, right+1):
        count = 0
        for j in range(1, i+1):
            if i%j == 0:
                count += 1
        
        if count %2 == 0:
            answer += i
        elif count%2 != 0:
            answer -= i
            
    return answer

print(solution(13, 17)) #43
print(solution(24, 27)) #52

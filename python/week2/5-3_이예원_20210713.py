#https://programmers.co.kr/learn/courses/30/lessons/42883

def solution(number, k):
    lst = []
    
    for i, v in enumerate(number):
        while lst and lst[-1] < v and k > 0:
            lst.pop()
            k -= 1
        
        if k == 0:
            lst.extend([x for x in number[i:]])
            break
        lst.append(v)
        
    lst = (lst[:-k] if k > 0 else lst)
        
    return ''.join(lst)

print(solution("1924", 2)) #94
print(solution("1231234", 3))#3234
print(solution("4177252841", 4)) #775841

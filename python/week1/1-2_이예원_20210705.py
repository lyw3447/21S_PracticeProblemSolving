def solution(skill, skill_trees):
    answer = 0
    
    for tree in skill_trees:
        flag = True
        list = []
    
        for i in range(len(tree)):
            if tree[i] in skill:
                list.append(tree[i])
    
        for j in range(len(list)):
            if list[j] != skill[j]:
                flag = False
                break
                
        if flag == True:
            answer += 1
            
    return answer


print(solution("CBD", ["BACDE", "CBADF", "AECB", "BDA"]))

def generate(numRows):
    result = []
    for i in range(numRows):
        tmp = []
        tmp.append(1)

        if len(result) != 0:
            for j in range(len(result[i-1])-1): #세번째 반복문에서부터 작동함
                tmp.append(result[i-1][j] + result[i-1][j+1])
                j+=2
            tmp.append(1)
        result.append(tmp)
            
    return result

print(generate(5))

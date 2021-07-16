def plusOne(digits):
    str_list = list(map(str, digits)) #make str list
    to_string = ''.join(str_list) #list to string
    
    plused = int(to_string) + 1 #string to integer
    result = list(str(plused)) #string to list
    
    answer = list(map(int, result)) 
    return answer

print("origin [1, 2, 3]") 
print(plusOne([1,2,3]))

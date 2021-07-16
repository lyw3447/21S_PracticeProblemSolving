#https://leetcode.com/problems/power-of-four/

def check(n):
    while num>4 :
        if num % 4 != 0:
            return False
        num /= 4
    return num in (1, 4)

print(check(5))

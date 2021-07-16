#https://leetcode.com/problems/lemonade-change/

def lemonadeChange(bills):
    lincoln = 0
    hamilton = 0
    
    for bill in bills:
        if bill == 5:
            lincoln += 1
        elif bill == 10:
            if lincoln < 1:
                return False
            else:
                hamilton += 1
                lincoln -= 1
        else:
            if hamilton > 0 and lincoln > 0:
                hamilton -= 1
                lincoln -= 1
            elif lincoln >= 3:
                lincoln -= 3
            else:
                return False
                
    return True 

print(lemonadeChange([5,5,5,10,20]))      
print(lemonadeChange([5,5,10,10,20]))
print(lemonadeChange([5,5,5,5,20,20,5,5,5,5]))

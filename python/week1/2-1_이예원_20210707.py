pw = ""
vowels = "aeiou"

while True:
    pw = input()

    if pw == "end":
        break

    if pw in vowels:
       print("<", pw, "> is acceptable.")
        
    else:
        flag = False
            
        for i in range(len(pw)-2):
            if pw[i] == pw[i+1] and pw[i:i+2] != "ee" and pw[i:i+2] != "oo":
                print("<", pw, "> is not acceptable.")
                break
            if pw[i] in vowels and pw[i+1] in vowels and pw[i+2] in vowels:
                print("<", pw, "> is not acceptable.")
                break
            
            elif pw[i] not in vowels and pw[i+1] not in vowels and pw[i+2] not in vowels:
                print("<", pw, "> is not acceptable.")
                break
            
            if pw[i] in vowels:
                flag = True

        else:
            if flag == True:
                print("<", pw, "> is acceptable.")
            else:
                print("<", pw, "> is not acceptable.")
        

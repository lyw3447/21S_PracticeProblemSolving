def printLines(str1):
    roop = int(len(str1)/10)

    if len(str1)%10 != 0:
        roop += 1

    listline = []
    start = 0
    end = 10

    for i in range(roop):
        
        if i == roop-1:
            listline.append(str1[start:])
        else:
             listline.append(str1[start:end])
        start += 10
        end += 10
             

    for line in listline:
        print(line)

printLines("BaekjoonOnlineJudge")
printLines("OneTwoThreeFourFiveSixSevenEightNineTen")

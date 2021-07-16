#https://leetcode.com/problems/backspace-string-compare/

def backspaceCompare(s, t):
    if s == t:
        return True

    # use pop() to remove '#' and do backspace
    s_list = list(s)
    t_list = list(t)

    while True:
        if s_list.count('#') == 0:
            break
        idx = s_list.index('#')
        s_list.pop(idx)

        if idx-1 >= 0:
            s_list.pop(idx-1)
    s = str(s_list)

    while True:
        if t_list.count('#') == 0:
            break
        idx = t_list.index('#')
        t_list.pop(idx)

        if idx-1 >= 0:
            t_list.pop(idx-1)
    t = str(t_list)

    if s != t:
        return False
    
    return True

print(backspaceCompare("ab#c", "ad#c"))
print(backspaceCompare("ab##", "c#d#"))
print(backspaceCompare("a##c", "#a#c"))
print(backspaceCompare("a#c", "b"))

a, b = input().split()

lenA = len(a)
lenB = len(b)
if  lenA == lenB :
    print("same")
elif lenA > lenB :
    print(a , lenA)
elif lenA < lenB :
    print(b ,lenB)
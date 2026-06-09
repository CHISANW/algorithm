a = int(input())

def validGreatNumber(a: int) -> bool:
    if a% 2 == 0 and a % 5 == 0:
        return True
    if a %2 != 0 and a % 3 == 0:
        return True
    return False


if validGreatNumber(a):
    print("true")
else:
    print("false")
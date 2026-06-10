sex = int(input()) # 0 : 남자, 1 : 여자
adult = int(input())

if adult >= 19:
    if sex == 0:
        print("MAN")
    else:
        print("WOMAN")
else:
    if sex == 0:
        print("BOY")
    else:
        print("GIRL")

import sys

three = 0
five = 0

for i in range(10):
    value  = int(sys.stdin.readline())
    if value % 3== 0:
        three += 1
    if value % 5 == 0:
        five += 1
print(three, five)

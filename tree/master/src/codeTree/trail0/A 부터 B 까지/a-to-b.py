import sys

a, b = map(int, sys.stdin.readline().split())

ans = []

while a <= b:
    print(a, end=" ")

    if a % 2 == 1:
        a *= 2
    else:
        a += 3

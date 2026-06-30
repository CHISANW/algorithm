import sys

a, b = map(int, sys.stdin.readline().split())

for i in range(a):
    for j in range(b):
        print("*", end=" ")
    print()
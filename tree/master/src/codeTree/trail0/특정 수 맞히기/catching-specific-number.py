import sys

line = int(sys.stdin.readline().strip())

while line != 25:
    if line < 25:
        print("Higher")
    else:
        print("Lower")
    line = int(sys.stdin.readline().strip())

print("Good")
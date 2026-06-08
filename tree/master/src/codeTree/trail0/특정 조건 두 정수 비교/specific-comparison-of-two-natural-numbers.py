a, b = map(int, input().split())

small = 1 if a < b else 0
same = 1 if a == b else 0

print(small, same)
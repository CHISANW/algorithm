n = int(input())
value = list(map(int, input().split()))

print(*[i**2 for i in value])
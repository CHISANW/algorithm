a , b = list(map(int, input().split()))

list = [a , b]

for i in range(2,10):
    list.append((list[i-2] + list[i-1])%10)

print(*list)
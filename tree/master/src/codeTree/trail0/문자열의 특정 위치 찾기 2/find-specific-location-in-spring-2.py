import sys

strs = ["apple", "banana" , "grape", "blueberry", "orange"]

letter = sys.stdin.readline().strip()

words = []

for word in strs:
    if word[2] == letter or word[3] == letter:
        words.append(word)

for word in words:
    print(word)

print(len(words))
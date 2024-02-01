import sys

minX, minY = 1000,1000

N = int(input())
for _ in range(N):
    while True:
        x, y = map(int, input().split())
        if abs(x) <= 1000 and abs(y) <= 1000:
            break

    if y < minY :
        minX = x
        minY = y

print(minX, minY)

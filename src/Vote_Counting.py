import sys

while True:
    T = int(input())  # 후보자 수
    if 1 <= T <= 100:
        break

for _ in range(T):
    while True:
        n = int(input())  # 각 후보가 받은 표의 수
        if 1 <= n <= 100:
            break

    if n % 5 == 0:
        result = "++++ " * ((n // 5) -1) + "++++"
    else:
        result = "++++ " * (n // 5) + "|" * (n % 5)

    print(result)
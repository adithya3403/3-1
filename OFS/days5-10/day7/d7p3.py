n = int(input())
l = []
for i in range(n):
    l.append(list(map(int, input().split())))
l.sort()
for i in range(n - 1):
    if l[i][1] > l[i + 1][0]:
        print("false")
        break
else:
    print("true")
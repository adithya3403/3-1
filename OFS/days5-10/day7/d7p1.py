n=int(input())
l=list(map(int, input().split()))
l1=sorted(l)
c=0
for i in range(n):
    if l[i]!=l1[i]:
        c+=1
print(c)
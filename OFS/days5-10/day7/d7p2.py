str=input()
d={}
for i in str:
    d[i]=d[i]+1 if i in d else 1
odd=0
for i in d:
    odd+=1 if d[i]%2==1 else 0
print(odd<=1)
line = list(map(str,input("").split()))
print(line)

for i in range(len(line)):
    for j in range(len(line)):
        if ((len(line[i]) < len(line[j])) and i!=j):
            temp = line[i]
            line[i] = line[j]
            line[j] = temp
line = line[::-1]
maxlen = 0
res=[]
for i in line:
    if len(i)%2==0:
        maxlen = max(maxlen,len(i))
        l = len(i)
        if(l<maxlen):
            break
        res.append(i)
for i in res:
    print(i,end=" ")







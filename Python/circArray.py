tools=['saw', 'hammer', 'mallet', 'file', 'saw', 'ladder', 'scissor']
s_ind = 6
target = "saw"
tloc=[]
for i in range(len(tools)):
    if tools[i] == target:
        tloc.append(i+1)
lim = 100
for i in tloc:
    lim = min(lim,abs(s_ind - i))

print(lim)

 
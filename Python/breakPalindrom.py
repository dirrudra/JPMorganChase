line = "aaabbaaa"
n = len(line)
low = 0
high = n-1
checker = True
mid = n//2

for i in range(n//2):
    if(line[low] != line[high]):
        checker = False
        break
    if(low == high):
        break
    else:
        low+=1
        high -=1
if checker:
    middle_index = len(line) // 2
    ch = line[middle_index]
    if(ch=="a"):
        
    ch = chr(ord(ch) - 1)
    line = line[:middle_index] + ch + line[middle_index + 1:]

print(line)

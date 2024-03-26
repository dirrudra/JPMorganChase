s= input("Enter binary ")
s = s[::-1]
val = 0
for i in range(0,len(s)):
    mul = 2**i
    if s[i] == "1":
        val+= mul
print(val)
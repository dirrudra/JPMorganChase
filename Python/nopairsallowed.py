words = ["add", "boook", "break"]

for i in words:
    ctr = 1
    res = []
    for j in range(0,len(i)-1):
        if i[j] == i[j+1]:
            ctr += 1
            if j == len(i)-2:
                res.append(ctr)
        else:
            res.append(ctr)
            ctr = 1
    sum_ = 0
    for k in res:
        if k > 1:
            sum_ += k//2
    print(sum_)



# words = ['add','boook','break']
# mx = 0
# for word in words:
#     ctr = 0
#     res=[]
#     for i in range(len(word)-1):
#         if (word[i]==word[i+1]):
#             ctr+=1
#         else:
#             ctr=0
#         res.append(ctr)
#     print(ctr)
#     # for i in range(len(res)):
#     #     res[i] = res[i] // 2   
#     # print(res)         
#     # print(sum(res))

def alg(list,target):
    for i in range(0,len(list)-1):
        if list[i]== target:
             return i
    else:
        return None

def res(n):
    if n is not None:
        print("Index of target value:",n)
    else:
        print("Doesn't Exist")

num=[1,2,3,4,5,6,7,8,9,10]


a=int(input("Enter Target Value to Retrieve: "))
r=alg(num,a)
res(r)

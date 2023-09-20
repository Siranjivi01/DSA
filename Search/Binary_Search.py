num=[1,2,3,4,5,6,7,8,9,10]



def binary(list,target):
    f=0
    l=len(list)-1

    while f<=l:
        mid=(f+l)//2        
        if list[mid]==target:
            return mid
        elif list[mid] < target:
            print(list[mid],target)
            f=mid+1
        else:
            print(list[mid],target)
            h=mid-1

def res(n):
    if n != -1:
        print("Index of Target Value: ",n)
    else:
        print("Doesn't Exist")

s=binary(num,3)
res(s)

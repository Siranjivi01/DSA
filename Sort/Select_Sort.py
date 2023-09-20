def selectionsort(a,size):
    for i in range(size):
        mini=i
        print(i)
        for j in range(i+1,size):
            if a[j]<a[mini]:
                mini=j
        temp=a[i]
        a[i]=a[mini]
        a[mini]=temp
array=[2000,1,32,68,3,-20]
b=len(array)
selectionsort(array,b)
print(array)

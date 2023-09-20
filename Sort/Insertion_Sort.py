def insertionsort(array):
    for i in range(1,len(array)):
        key=array[i]
        j=i-1
        while j>=0 and key<array[j]:
            array[j+1]=array[j]
            j=j-1
        array[j+1]=key
data=[20,30,-20,-6,50,100]
insertionsort(data)
print(data)

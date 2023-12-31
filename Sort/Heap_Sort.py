def heap(arr,n,i):
    largest=i
    left=2*i+1
    right=2*i+2

    if left<n and arr[i]<arr[left]:
        largest=left
    if right<n and arr[i]<arr[right]:
        largest=right

    if largest != i:
        arr[i],arr[largest]=arr[largest],arr[i]
        heap(arr,n,largest)

def heapsort(arr):
    n=len(arr)

    for i in range(n//2,-1,-1):
        heap(arr,n,i)
    for i in range(n-1,-1,-1):
        #swap
        arr[i],arr[0]=arr[0],arr[i]
        heap(arr,i,0)

data=[2000,10,-20,20,1,15]
heapsort(data)
print(data)

def heap(arr,n,i):
    root = i
    left = 2*i+1
    right = 2*i+2

    if(left < n and arr[left]>arr[root]):
        root = left
    if(right < n and arr[right]>arr[root]):
        root = right

    if(root != i):
        arr[i],arr[root]=arr[root],arr[i]

        heap(arr,n,root)




def heapSort(arr):

    n = len(arr)

    for i in range(n//2,-1,-1):
        heap(arr,n,i)

    for i in range(n-1,0,-1):
        arr[i],arr[0] = arr[0],arr[i]

        heap(arr,i,0)




arr = [1,2,54,78,94,34,4]

heapSort(arr)

n =len(arr)

for i in range(n):
    print(arr[i],end=" ")


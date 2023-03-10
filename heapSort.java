import java.net.SocketPermission;

public class heapSort {

    public void sort(int arr[]){
        int  n = arr.length;

        for (int i=n/2-1;i>=0;i--){
            heap(arr,n,i);
        }


        for(int i = n-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;


            heap(arr, i, 0);
        }
    }

    void heap(int arr[],int n,int i){

        int root = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left < n && arr[left]>arr[root]){
            root = left;

        }

        if(right < n && arr[right]>arr[root]){
            root = right;
            
        }

        if(root != i){
            int temp = arr[i];
            arr[i] = arr[root];
            arr[root] = temp;

            heap(arr, n, root);
        }

    }

     void printArr(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){

            System.out.print(arr[i]+" ");
            

        }
    }


    public static void main(String[] args) {

        int arr[]={18,15,1,78,32,79,2,3,4};

        heapSort obj = new heapSort();

        obj.sort(arr);

        obj.printArr(arr);


        
    }
    
}

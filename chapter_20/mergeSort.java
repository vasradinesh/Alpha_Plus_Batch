

public class mergeSort {

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr,si, mid );
        mergeSort(arr,mid + 1, ei );
        merge(arr, si, mid, ei);
    }
    // to merge sorted part 
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si;   //index for first sorted part
        int j = mid+1;   //index for second  sorted part
        int k = 0;       //index for temp array sorted part

        while (i<=mid && j<=ei){
            if(arr[i] >  arr[j]){
                temp[k]=arr[j];
                j++;
            }
            else{
                temp[k]=arr[i];
                i++;
            }
            k++;
        }
        // for ramaining element of first sorted part
        while(i<=mid){
            temp[k++]= arr[i++];
        }
        // for remaining element of second sorted part
        while(j<=ei){
            temp[k++]= arr[j++];
        }
        // copy into main array
        for(i=si,k=0;k<temp.length;i++,k++ ){
            arr[i]=temp[k];
        }

    }
    public static void main(String[] args) {
        int arr[] = {4,5,3,2,1};
        mergeSort(arr, 0,arr.length-1);
        printarr(arr);
    }
}

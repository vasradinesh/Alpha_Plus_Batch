
// return majority element in array

public class que_2 {

    public static int count(int arr[],int num,int lo,int hi){
        int count = 0;
        for(int i =lo;i<=hi;i++){
            if(arr[i]==num){
                count++;
            }

        }
        return count;
    }


    static int majority(int arr[],int lo,int hi){
        if(lo==hi){
            return arr[lo];
        }
        int mid = lo + (hi-lo)/2;
        int left = majority(arr, lo, mid);
        int right = majority(arr, mid+1, hi);

        if(left == right){
            return left;
        }
        
        int leftcount = count(arr,left,lo,hi);
        int rightcount = count(arr,right,lo,hi);
        return leftcount<rightcount?right:left;
    }
    public static void main(String[] args) {
        int arr[] = {3,3,4,4,4};
        int majority = majority(arr, 0, arr.length-1);
        System.out.println(majority);
    }
}

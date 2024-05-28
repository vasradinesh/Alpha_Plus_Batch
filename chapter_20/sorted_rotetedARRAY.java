public class sorted_rotetedARRAY {

    public static int sorted_rotetedARRAY(int array[],int si,int target,int ei){
        if(si>ei){
            return -1;
        }
        int mid = si + (ei-si)/2;
        //trget is found 
        if(array[mid] == target){
            return mid ;
        }

        // mid in l1
        if(array[si]<=array[mid]){
            // case:1 left
            if(array[si]<=target && target<=array[mid]){
                return sorted_rotetedARRAY(array, si, target, mid-1);
            }
            // case:2 right
            else{
                return sorted_rotetedARRAY(array, mid + 1, target, ei);
            }
        }
        // mid in l2
        else{
            if(array[mid]<=target && target<=array[ei]){
                // case:3 right
                return sorted_rotetedARRAY(array, mid+1, target, ei);
            }
            else{
                // case:4 left
                return sorted_rotetedARRAY(array, si, target, mid-1);
            }
        }
    } 
    public static void main(String[] args) {
        int array[] = {4,5,6,7,0,1,2,3};
        int idx = sorted_rotetedARRAY(array, 0, 3, array.length-1);
        System.out.println(idx);
    }
}

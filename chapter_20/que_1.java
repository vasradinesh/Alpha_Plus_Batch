
// apply merge sort to sort string array

public class que_1 {
    public static String[] mergesort(String str[],int lo,int hi){
        if(lo==hi){
            String a[] = {str[lo]};
            return a;
        }
        int mid = lo + (hi-lo)/2;
        String str1[] = mergesort(str, lo, mid );
        String str2[] = mergesort(str, mid+1, hi);
        String S[] = merge(str1,str2);
        return S;

    }
    public static String[] merge(String str1[],String str2[]){
        int m = str1.length;
        int n = str2.length;
        String str3[] = new String[m+n];

        int idx = 0;
        int i= 0;
        int j=0;
        while(i<m && j<n){
            if(issmaller(str1[i],str2[j])){
                str3[idx] = str1[i];
                i++;
                idx++;
            }
            else{
                str3[idx] = str2[j];
                j++;
                idx++;
            }
        }
        while(i<m){
            str3[idx]=str1[i];
            i++;
            idx++;
        }
        while(j<n){
            str3[idx]=str2[j];
            j++;
            idx++;
        }
        return str3;

    }

    static boolean issmaller(String str1 ,String  str2){
        if(str1.compareTo(str2)<0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        String []str = {"zxc","apple","zzz","eee","yyy"};
        String arr[] = mergesort(str, 0, str.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

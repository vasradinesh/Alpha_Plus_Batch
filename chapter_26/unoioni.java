import java.util.HashMap;
import java.util.HashSet;

public class unoioni {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,2,1};
        int arr2[] = {2,8,4,2,1};
        HashSet<Integer> hs = new HashSet<>();
        // union

        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        
        for(int i=0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        System.out.println("union : " +hs.size());
        hs.clear();
        // intesection

        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        int count = 0;
        for(int i=0;i<arr2.length;i++){
            if(hs.contains(arr2[i])){
                count++;
                hs.remove(arr2[i]);
            }
        }
        System.out.println("intersection : " + count);


    }
}

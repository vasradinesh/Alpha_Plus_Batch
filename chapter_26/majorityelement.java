import java.util.*;
public class majorityelement {
    public static void main(String[] args) {
        int data[] = {1,1,22,2,2,2,2,1,1,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<data.length;i++){
            int val = data[i];
            if(map.containsKey(val)){
                map.put(data[i],(map.get(data[i])+1));
            }
            else{
                map.put(data[i], 1);
            }
        }

        Set<Integer> keyset = map.keySet();
        for (Integer keyy : keyset) {
            if(map.get(keyy)>data.length/3){
                System.out.println(keyy);
            }
        }
    }
}

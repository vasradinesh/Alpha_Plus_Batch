import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        // add value
        
        hm.put("gujrat", 7);
        hm.put("up", 25);
        hm.put("goa", 1);

        System.out.println(hm);

        // grt value
        System.out.println(hm.get("goa"));

        //cotain key
        System.out.println(hm.containsKey("up")); 

        // remove
        hm.remove("goa");
        System.out.println(hm);
        
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}

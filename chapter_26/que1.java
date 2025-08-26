import java.util.HashMap;

public class que1 {
    public static int findPairs(int[] nums, int k) {
        if (k < 0) return 0; // abs value required
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int count = 0;
        for (int num : map.keySet()) {
            if (k == 0) {
                if (map.get(num) > 1) count++;
            } else {
                if (map.containsKey(num + k)) count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {3,4,5};
        int count = findPairs(nums,2);
        System.out.println(count);
    }
}


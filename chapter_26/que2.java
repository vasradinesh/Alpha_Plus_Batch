import java.util.Arrays;
import java.util.TreeMap;


// sort using map

public class que2 {
     public static void main(String[] args) {
        int[] nums = {4, 2, 5, 3, 2};

   
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        for (int key : map.keySet()) {          // keys are automatically sorted
            for (int i = 0; i < map.get(key); i++) {
                nums[index++] = key;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}

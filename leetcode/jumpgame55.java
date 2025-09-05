public class jumpgame55 {
    public static boolean canJump(int[] nums) {
       int i = 0, farthest = 0;
        while (i < nums.length) {
            if (i > farthest) {
              return false;
            }
            farthest = Math.max(farthest, i + nums[i]);
            if (farthest >= nums.length - 1) return true; 
            i++;
        }
        return false;

    }
    public static void main(String [] args){
        int nums[] = {2, 3, 1, 1, 4};
        System.out.println(canJump(nums));
    }
}

import java.util.Arrays;

public class maximum_moves {
    public static void main(String args[]){
        int nums[]={1,2,3,4,5};
        minMoves2(nums);
    }
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int operations = 0, mid = nums[nums.length / 2];
        for (int num : nums)
            operations += Math.abs(mid - num);
        return operations;
    }
}

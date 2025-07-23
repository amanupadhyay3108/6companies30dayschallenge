public class nice_subArrays {
    public static void main(String[] args) {
        nice_subArrays solution = new nice_subArrays();
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;
        int result = solution.numberOfSubarrays(nums, k);
        System.out.println(result); // Output the number of nice subarrays
    }       
    public static int countnice(int nums[], int goal) {
        if (goal < 0)
            return 0;
        int l = 0, r = 0;
        int sum = 0;
        int count = 0;
        while (r < nums.length) {
            sum += nums[r] % 2;
            while (sum > goal && l <= r) {
                sum -= nums[l++]%2;
            }
            count += r - l + 1;
            r++;
        }
        return count;
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        return countnice(nums, k) - countnice(nums, k - 1);
    }
}

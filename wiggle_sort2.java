
    import java.util.Arrays;

    public class wiggle_sort2 {
        public static void wiggleSort(int[] nums) {
            int n = nums.length;
    
            // Step 1: Sort the array
            Arrays.sort(nums);
    
            // Step 2: Create a new array for the rearrangement
            int[] sorted = Arrays.copyOf(nums, n);
    
            // Step 3: Use two pointers to arrange elements
            int left = (n - 1) / 2; // End of the smaller half
            int right = n - 1;      // End of the larger half
    
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    nums[i] = sorted[left--]; // Take from smaller half
                } else {
                    nums[i] = sorted[right--]; // Take from larger half
                }
            }
        }
    
        public static void main(String[] args) {
            int[] nums = {1, 3, 2, 2, 3, 1};
            wiggleSort(nums);
            System.out.println("Wiggle Sorted Array: ");
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
    }

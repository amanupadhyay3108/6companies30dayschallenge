import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class subsequenceSum {
    public static void main(String[] args) {
        // Example usage
        subsequenceSum obj = new subsequenceSum();
        int[] nums = {3, 1, 4, 1, 5, 9, 2, 6};
        int k = 3;
        int[] result = obj.maxSubsequence(nums, k);
        System.out.println(Arrays.toString(result)); // Output: [1, 2, 3]
    }
        public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
      for(int i=0;i<nums.length;i++){
        pq.add(new int[]{nums[i],i});
        if(pq.size()>k)pq.poll();
      }
      int indices[][]=pq.toArray(new int[0][0]);
      Arrays.sort(indices, Comparator.comparingInt( a -> a[1]));
      int result[]=new int[k];
      for(int i=0;i<k;i++){
        result[i]=indices[i][0];
      }
      return result;

    }
}

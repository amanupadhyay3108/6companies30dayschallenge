import java.util.*;
class envelopes_and_dolls {
    public static void main(String args[]){
        int env[][]={{2,3},{3,4},{5,6},{8,5}};
        int max=maxEnvelopes(env);
    }
    public static int maxEnvelopes(int[][] envelopes) {
          Arrays.sort(envelopes,(a,b)->a[0]==b[0]?b[1]-a[1]:a[0]-b[0]);
         int[] heights = new int[envelopes.length];
        for (int i = 0; i < envelopes.length; i++) {
            heights[i] = envelopes[i][1];
        }

        return lengthOfLIS(heights);
        
    }
    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;

        for (int num : nums) {
            int index = Arrays.binarySearch(dp, 0, len, num);
            if (index < 0) {
                index = -(index + 1);
            }
            dp[index] = num;
            if (index == len) {
                len++;
            }
        }

        return len;
    }

}
import java.util.HashSet;
import java.util.Set;

public class max_Sum_Distinct_subArray {
    public long maximumSubarraySum(int[] nums, int k) {
        int i=0;
        Set<Integer>set=new HashSet<>();

        int csum=0;
        int max=0;
        for(int end=0;end<nums.length;end++){
            if(!set.contains(nums[end])){
                set.add(nums[end]);
                csum+=nums[end];
                if(end-i+1==k){
                    max=Math.max(csum,max);
                    csum-=nums[i];
                    set.remove(nums[i]);
                    i++;
                
                }
            }else{
                while(nums[i]!=nums[end]){
                    csum-=nums[i];
                    set.remove(nums[i]);
                    i++;
                }
            }
        }
        return max;
    }
}

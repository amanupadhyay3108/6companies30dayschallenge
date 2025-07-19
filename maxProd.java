import java.util.*;

public class maxProd {
    public static void main(String[] args) {                
        // Example usage
        int[] nums = {1, 2, 3};     
        int k = 3;
        int result = maximumProduct(nums, k);   
        System.out.println("Maximum Product: " + result);
    }   
        
        public static int maximumProduct(int[] nums, int k) {
      int n=nums.length;
      long mod=1000000007;
      if(n==1){
        long ans=(nums[0]+k)%mod;;
        return (int)ans;
      }
      PriorityQueue<Long>pq=new PriorityQueue<>();
      for(int a:nums)pq.add((long)a);
      while(k>0){
        long n1=pq.poll();
        long n2=pq.poll();
        long diff=Math.min((long)k,n2-n1+1);
        n1+=diff;
        k-=diff;
        pq.add(n1);
        pq.add(n2);
      }
      long prod=1;
      while(!pq.isEmpty()){
        prod=(prod*pq.poll())%mod;
      }
    return (int)prod;
    }
}

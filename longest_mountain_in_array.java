public class longest_mountain_in_array {
    public static void main(String args[]){
        int arr[]={2,1,4,5,7,3,2,5};
        System.out.println(longestMountain(arr));
    }
    public static int longestMountain(int[] arr) {
        int len=0;
        for(int i=1;i<arr.length-1;i++){
             // Check if we are at the peak of a mountain
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                int left=i-1;
                int right=i+1;
                 
                 // Count the left side of the mountain (increasing)
                while(left>0 && arr[left]>arr[left-1])left--;

                 // Count the right side of the mountain (decreasing)
                while(right<arr.length-1&&arr[right]>arr[right+1])right++;
                len=Math.max(len,right-left+1);
            }
        }
        return len;
    }
}

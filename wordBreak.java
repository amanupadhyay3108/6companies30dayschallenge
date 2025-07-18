
import java.util.HashSet;
import java.util.List;  
public class wordBreak {
    public static void main(String[] args) {
        wordBreak wb = new wordBreak();
        List<String> wordDict = List.of("leet", "code");
        String s = "leetcode";
        boolean result = wb.wordBreak(s, wordDict);
        System.out.println(result); // Output: true 
    }   
      public boolean wordBreak(String s, List<String> wordDict) {
       HashSet<String>set=new HashSet<>(wordDict);
       boolean dp[]=new boolean[s.length()+1];
       dp[0]=true;
       for(int i=0;i<=s.length();i++){
        for(int j=0;j<i;j++){
            if(dp[j]&&set.contains(s.substring(j,i))){
                dp[i]=true;
                break;
            }
        }
       }
       return dp[s.length()];
}
}

import java.util.Arrays;

public class assignCookies {
    public static void main(String[] args) {
        // Example usage
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        int result = findContentChildren(g, s);
        System.out.println("Number of content children: " + result);    
    }
      public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0,count=0;
        while(i<g.length&&j<s.length){
            if(g[i]<=s[i]){
                i++;
                j++;
                count++;
            }else j++;
        }
        return count;
    }
}


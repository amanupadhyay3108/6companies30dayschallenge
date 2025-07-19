import java.util.Arrays;
import java.util.*;
  

public class reachableCities {
    public static void main(String[] args) {
     
        int n = 4;
        int[][] edges = {{0, 1, 3}, {1, 2, 1}, {2, 3, 1}, {0, 3, 4}};
        int distanceThreshold = 4;
        int result = findTheCity(n, edges, distanceThreshold);
        System.out.println(result); // Output: 3        
    }
      public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], 10001); 
            dist[i][i] = 0;
        }
      for(int []edge:edges){
        dist[edge[0]][edge[1]]=edge[2];
         dist[edge[1]][edge[0]] = edge[2];
      }
      for(int k=0;k<n;k++){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
            }
        }
      }
      int min=10001;
      int city=0;
      for(int i=0;i<n;i++){
        int reach=0;
        for(int j=0;j<n;j++){
            if(dist[i][j]<=distanceThreshold)reach++;
        }
        if(min>=reach){
            min=reach;
            city=i;
        }
      }
      return city;
    }
}

import java.util.*;

public class asteroids {
    public static void main(String[] args) {
      
        int mass = 10;
        int[] asteroids = {3, 9, 19, 5};
        boolean result =asteroidsDestroyed(mass, asteroids);
        System.out.println(result); // Output: true
    }
    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long temp=mass;
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]<=temp)
            temp+=asteroids[i];
            else return false;
        }
        return true;
    }
}

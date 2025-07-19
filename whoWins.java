import java.util.Arrays;

public class whoWins {
    public static void main(String[] args) {
   
        int[] aliceValues = {1, 3, 5};
        int[] bobValues = {2, 4, 6};
        int result =stoneGameVI(aliceValues, bobValues);
        System.out.println(result); // Output: -1 (Bob wins)    
    }

     public static int stoneGameVI(int[] aliceValues, int[] bobValues) {
         int n = aliceValues.length;
        int[][] stones = new int[n][3];

        for (int i = 0; i < n; i++) {
            stones[i][0] = aliceValues[i];
            stones[i][1] = bobValues[i];
            stones[i][2] = aliceValues[i] + bobValues[i];
        }
        Arrays.sort(stones, (a, b) -> b[2] - a[2]);

        int alice = 0, bob = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                alice += stones[i][0];
            } else {
                bob += stones[i][1];
            }
        }

        if (alice > bob) return 1;
        else if (alice < bob) return -1;
        return 0;
    }
}

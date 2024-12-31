public class winner_of_circularGame {
    public static void main(String args[]){
           findTheWinner(5, 2);
    }
  
        public static int findTheWinner(int n, int k) {
        int winner=0;
            for (int i = 1; i <= n; i++) {
                winner = (winner + k) % i;
            }
            return winner + 1;
    }
    
}

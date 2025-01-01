import java.util.HashMap;

public class bull_and_cows {
    public static void main(String args[]){
    System.out.println(getHint("0110","1001"));
    }
    
    public static String getHint(String secret, String guess) {
        HashMap<Character, Integer> secretmap = new HashMap<>();
        HashMap<Character, Integer> guessmap = new HashMap<>();
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if (s == g) {
                bulls++;
            } else {
                secretmap.put(s, secretmap.getOrDefault(s, 0) + 1);
                guessmap.put(g, guessmap.getOrDefault(g, 0) + 1);
            }
        }
        for (char key : secretmap.keySet()) {
            int guessCount = guessmap.getOrDefault(key, 0);
            int secretCount = secretmap.getOrDefault(key, 0);
            cows += Math.min(guessCount, secretCount);
        }
        return bulls + "A" + cows + "B";
    }
}


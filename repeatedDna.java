import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class repeatedDna {
    public static void main(String args[]){
        String str="AAAAAAAAAAAAAAAAAAA";
         findRepeatedDnaSequences(str);
    }
    public static List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();

        for (int i = 0; i <= s.length() - 10; i++) {
            String sub = s.substring(i, i + 10);
            map.put(sub, map.getOrDefault(sub, 0) + 1);
        }
        for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                ans.add(key);
            }
        }
        return ans;
    }

}

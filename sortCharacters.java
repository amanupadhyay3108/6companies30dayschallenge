import java.util.HashMap;
import java.util.PriorityQueue;

class pair{
    char ch;
    int f;
    public pair(char ch,int f){
        this.ch=ch;
        this.f=f;
    }
}
public class sortCharacters {
    public static void main(String[] args) {
        sortCharacters sc = new sortCharacters();
        String result = sc.frequencySort("tree");
        System.out.println(result); // Output: "eetr" or "eert"         
    }   
     public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->b.f-a.f);
        for(char key:map.keySet()){
            pq.add(new pair(key,map.get(key)));
        }
        StringBuilder sb=new StringBuilder("");
        while(!pq.isEmpty()){
            pair p=pq.poll();
            char c=p.ch;
            int fr=p.f;
            while(fr-->0)sb.append(c);
        }
        return sb.toString();

        
    }
}

import java.util.*;
public class boltsAndNuts {
       public static void main(String args[]){
       int n = 5;
       char nuts[] = {'@','%', '$','#','^'};
       char bolts[] = {'%', '@', '#', '$','^'};
       matchPairs(n, nuts, bolts);
       }
       public static void matchPairs(int n, char nuts[], char bolts[]) {
            // code here
            char[] set={'!','#','$','%','&','*','?','@','^'};
            Set<Character> setnuts=new HashSet<>();
            Set<Character> setbolts=new HashSet<>();
             for(int i=0;i<nuts.length;i++){
                setnuts.add(nuts[i]);
            }
            for(int i=0;i<bolts.length;i++){
                setbolts.add(bolts[i]);
            }
            int k=0,p=0;
            for(int i=0;i<set.length;i++){
                if(setnuts.contains(set[i])){
                    nuts[k++]=set[i];
                  
                }
                if(setbolts.contains(set[i])){
                    bolts[p++]=set[i];
                  
                }
            }
        }
    
}

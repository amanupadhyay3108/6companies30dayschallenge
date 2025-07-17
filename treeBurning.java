import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}   
public class treeBurning {
     public void Inorder(   HashMap<Integer,List<Integer>>map,Set<Integer>set,TreeNode root,int par){
        if(root==null)return ;
        if(!map.containsKey(root.val))map.put(root.val,new ArrayList<>());
        map.get(root.val).add(par);
        set.add(root.val);
        if(root.right!=null){
            map.get(root.val).add(root.right.val);
            Inorder(map,set,root.right,root.val);
        }
        if(root.left!=null){
            map.get(root.val).add(root.left.val);
            Inorder(map,set,root.left,root.val);
        }
    }
    public int amountOfTime(TreeNode root, int start) {
        Set<Integer>set=new HashSet<>();
        
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        Queue<Integer>q=new LinkedList<>();

        Inorder(map,set,root,-1);
        q.add(start);
        int time=0;
        while(!q.isEmpty()){
            int n=q.size();
            time++;
            for(int i=0;i<n;i++){
                int node=q.poll();
                set.remove(node);
                for(int r:map.get(node)){
                    if(r!=-1 && set.contains(r))q.add(r);
                }
                
            }
        }
return time-1;

        
    }
}

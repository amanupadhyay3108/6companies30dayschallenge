import java.util.*;
public class battleship {
    public void dfs(char[][] board,boolean[][] visited,int row[],int col[],int i,int j){
        visited[i][j]=true;
        for(int k=0;k<4;k++){
            int cr=i+row[k];
            int cc=j+col[k];
            if(cr>=0&&cc>=0&&cr<board.length&&cc<board[0].length&&!visited[cr][cc]&&board[cr][cc]=='X'){
                  dfs(board,visited,row,col,cr,cc);
            }
        }
        
    }
    public int countBattleships(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean visited[][]=new boolean[n][m];
        int row[]={0,0,1,-1};
        int col[]={-1,1,0,0};
        int count=0;
                for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j]&&board[i][j]=='X'){
                    count++;
                    dfs(board,visited,row,col,i,j);
                }
            }
        }
        return count;
    }
}

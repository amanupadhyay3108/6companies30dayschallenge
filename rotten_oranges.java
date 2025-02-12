import java.util.*;

public class rotten_oranges {
    public static class info {
        int i;
        int j;
    
        info(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
    public static void main(String args[]){
        int[][] grid = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };
        System.out.print(orangesRotting(grid));
        
    }
    public static int orangesRotting(int[][] grid) {
        int fresh = 0;
        Queue<info> q = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    q.add(new info(i, j));
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        if (fresh == 0)
            return 0;
        int time = 0;
        while (!q.isEmpty()) {
            int size = q.size();

            int rot = 0;
            for (int k = 0; k < size; k++) {
                info curr = q.poll();
                int i = curr.i;
                int j = curr.j;
                if (j > 0 && grid[i][j - 1] == 1) {
                    grid[i][j - 1]++;
                    q.add(new info(i, j - 1));
                    fresh--;
                    rot++;
                }
                if (j < grid[0].length - 1 && grid[i][j + 1] == 1) {
                    grid[i][j + 1]++;
                    q.add(new info(i, j + 1));
                    fresh--;
                    rot++;
                }
                if (i > 0 && grid[i - 1][j] == 1) {
                    grid[i - 1][j]++;
                    q.add(new info(i - 1, j));
                    fresh--;
                    rot++;
                }
                if (i < grid.length - 1 && grid[i + 1][j] == 1) {
                    grid[i + 1][j]++;
                    q.add(new info(i + 1, j));
                    fresh--;
                    rot++;
                }

                grid[i][j]++;
            }
            if (rot > 0) {
                time++;
            }

        }
        return fresh == 0 ? time : -1;
    }
}



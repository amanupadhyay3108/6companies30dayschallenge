class imageSmoother {
    public static void main(String args[]){
        int[][] img = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
      img=  imageSmoother(img);
      for(int i=0;i<img.length;i++){
        for(int j=0;j<img[0].length;j++){
            System.out.print(img[i][j]+" ");
        }
        System.out.println();
    }
    }
    public static int[][] imageSmoother(int[][] img) {
        int result[][]=new int[img.length][img[0].length];
        for(int i=0;i<img.length;i++){
            for(int j=0;j<img[0].length;j++){
                result[i][j]=smoother(i,j,img);
            }
        }
        return result;
    }
    public static int smoother(int x,int y,int img[][]){
        int m=img.length;
        int n=img[0].length;
        int sum=0;
        int count=0;
        for(int i=-1;i<=1;i++){
           for(int j = -1; j <= 1; j++) {
                int nx = x + i;
                int ny = y + j;
                if(nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
                sum += img[nx][ny];
                count++;
            }
        }
        return sum/count;
    }
}
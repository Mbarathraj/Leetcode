class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int tot=0;
        for(int i=0;i<=grid.length-3;i++){
            for(int j=0;j<=grid[0].length-3;j++){
                int [][]g=new int[3][3];
                int c=0,c1=0;
                for(int k=i;k<i+3;k++){
                    c1=0;
                    for(int l=j;l<j+3;l++){
                        g[c][c1++]=grid[k][l];
                    }
                    c++;
                }
                   tot+= find(g);
            }
        }
        return tot;
    }
    int find(int [][]grid){
        int[] num=new int[10];
        for(int i=0;i<3;i++){
            int rSum=0, cSum=0, rD=0, lD=0;
            for(int j=0;j<3;j++){
                if(grid[i][j]>9 || grid[j][i]>9) return 0;
                rSum+=grid[i][j];
                cSum+=grid[j][i];
                num[grid[i][j]]++;
            }
           if(rSum!=cSum || rSum!=grid[0][0]+grid[1][1]+grid[2][2] || rSum!=grid[0][2]+grid[1][1]+grid[2][0] || cSum!=grid[0][2]+grid[1][1]+grid[2][0] || cSum!=grid[0][0]+grid[1][1]+grid[2][2] || grid[0][0]+grid[1][1]+grid[2][2]!=grid[0][2]+grid[1][1]+grid[2][0] ) return 0;
        }
        for(int i=1;i<10;i++){
            if(num[i]!=1) return 0;
        }
        return 1;
    }
}
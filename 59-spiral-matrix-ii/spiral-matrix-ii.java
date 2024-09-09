class Solution {
    public int[][] generateMatrix(int n) {
        int len=n*n;
        int a[][]=new int[n][n];
        int tr=0,br=n-1,lc=0,rc=n-1;
        int c=1;
        while(tr<=br && lc<=rc){
            for(int col=lc;col<=rc;col++){
                a[tr][col]=c++;
            }
            tr++;
            for(int row=tr;row<=br;row++){
                a[row][rc]=c++;
            }
            rc--;
            for(int col=rc;col>=lc;col--){
                a[br][col]=c++;
            }
            br--;
            for(int row=br;row>=tr;row--){
                a[row][lc]=c++;
            }
            lc++;
        }
        return a;
    }
}
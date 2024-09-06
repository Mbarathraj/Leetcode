class Solution {
    public int[][] construct2DArray(int[] o, int m, int n) {
        if(m*n!=o.length) return new int[0][0];
        int a[][]=new int[m][n];
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=o[c++];
            }
        }
        return a;
    }
}
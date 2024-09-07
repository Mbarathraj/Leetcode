class Solution {
    public void rotate(int[][] mat) {
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
               if(i<j){
                 int t=mat[i][j];
                 mat[i][j]=mat[j][i];
                 mat[j][i]=t;
               }
            }
        }
        for(int i=0;i<mat.length;i++){
            int k=0,j=mat.length-1;
            while(k<j){
                int t=mat[i][k];
                mat[i][k]=mat[i][j];
                mat[i][j]=t;
                k++;j--;
            }
        }
       
    }
}
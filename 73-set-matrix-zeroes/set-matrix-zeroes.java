class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                 al.add(new ArrayList<>());
                 al.get(al.size()-1).add(i);
                 al.get(al.size()-1).add(j);
                }
            }
        }
        for(ArrayList<Integer> li:al){
            int i=li.get(0),j=li.get(1);
            while(j>=0){
                matrix[i][j--]=0;
            }
            j=li.get(1);
            while(j<matrix[i].length){
                matrix[i][j++]=0;
            }
            j=li.get(1);
            while(i>=0){
                matrix[i--][j]=0;
            }
            i=li.get(0);
            while(i<matrix.length){
                matrix[i++][j]=0;
            }
        }
        
    }
}
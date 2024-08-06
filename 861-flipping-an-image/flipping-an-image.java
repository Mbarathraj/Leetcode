class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int []a:image){
            int i=0,j=a.length-1;
            while(i<=j){
                int t=a[i]==0 ? 1:0;
                a[i]=a[j]==0? 1:0;
                a[j]=t;
                i++;j--;
            }
        }
        return image;
    }
}
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int []a:image){
            int i=0,j=a.length-1;
            while(i<j){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                i++;j--;
            }
        }
       for(int a[]:image){
          int i=0,j=a.length-1;
            while(i<=j){
                if(a[i]==0) a[i]=1;
                else if(a[i]==1) a[i]=0;
            if(i!=j){
                if(a[j]==0) a[j]=1;
                else if(a[j]==1) a[j]=0;
            }
                i++;j--;
            }
       }
        return image;
    }
}
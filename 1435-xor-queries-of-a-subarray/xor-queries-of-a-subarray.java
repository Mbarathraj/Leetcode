class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int a[]=new int[queries.length];
        int c=0;
        for(int q[]:queries){
           int sum=0;
           for(int i=q[0];i<=q[1];i++){
              sum^=arr[i];
           }
           if(c<a.length) a[c++]=sum;
        }
        return a;
    }
}
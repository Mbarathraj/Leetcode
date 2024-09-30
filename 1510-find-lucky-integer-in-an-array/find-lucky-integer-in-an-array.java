class Solution {
    public int findLucky(int[] arr) {
        int a[]=new int[501];
        for(int i:arr){
            a[i]++;
        }
        int max=0;
        for(int i=1;i<a.length;i++){
            if(i==a[i]){
                max=Math.max(max,i);
            }
        }
        if(max==0) return -1;
        return max;
    }
}
class Solution {
    public int findMaxK(int[] nums) {
        int a[]=new int[1001];
        for(int i:nums){
            if(i>0){
                a[i]++;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            if(i<0){
                if(a[i*-1]>0){
                    max=Math.max(i*-1,max);
                }
            }
        }
        return max==Integer.MIN_VALUE ? -1:max;
    }
}
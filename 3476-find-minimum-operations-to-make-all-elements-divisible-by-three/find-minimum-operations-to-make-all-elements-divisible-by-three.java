class Solution {
    public int minimumOperations(int[] nums) {
       int c=0;
        for(int i:nums){
            int t=i+1;
            int t1=i-1;
            if(t%3==0 || t1%3==0) c++;
        }
        return c;
    }
}
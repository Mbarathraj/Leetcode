class Solution {
    public long findMaximumScore(List<Integer> nums) {
        long ma=0,res=0;
        for(int a:nums){
            res+=ma;
           ma= Math.max(ma,a);
        }
        return res;
    }
}
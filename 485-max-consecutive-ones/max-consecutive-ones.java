class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,ma=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
               c++;
            else{
                ma=Math.max(ma,c);c=0;
            }
        }
        ma=Math.max(ma,c);
        return ma;
    }
}
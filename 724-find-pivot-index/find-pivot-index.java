class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
            if(sum1==sum) return i;
            sum-=nums[i];
        }
        return -1;
    }
}
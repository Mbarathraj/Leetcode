class Solution {
    public int findPeakElement(int[] nums) {
        int ma=Integer.MIN_VALUE,pos=0;
        for(int i=0;i<nums.length;i++){
            if(ma<nums[i]){
                ma=nums[i];
                pos=i;
            }
        }
        return pos;
    }
}
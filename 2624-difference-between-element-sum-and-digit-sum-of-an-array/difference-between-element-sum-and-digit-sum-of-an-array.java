class Solution {
    public int differenceOfSum(int[] nums) {
        int eSum=0,dSum=0;
        for(int i:nums){
            eSum+=i;
            while(i>0){
                dSum+=i%10;
                i/=10;
            }
        }
        return eSum-dSum;
    }
}
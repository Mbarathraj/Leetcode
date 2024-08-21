class Solution {
    public int sumOfUnique(int[] nums) {
       int[] count = new int[101];
        for(int num:nums)
        {
            count[num]++;
        }
        int sum=0;
        for(int num:nums)
        {
            if(count[num]==1)
            {
                sum+=num;
            }
        }
        return sum;
    }
}
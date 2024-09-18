class Solution {
    public String largestNumber(int[] nums) {
        int t=0,j=1;

while (t < nums.length) {
    if (j >= nums.length) {
        t++;
        j = t + 1; // Set j to the next element after t
    }
    
    if (j < nums.length) {
        String s1 = "" + nums[t] + nums[j];
        String s2 = "" + nums[j] + nums[t];
        if (s1.compareTo(s2) < 0) {
            // Swap nums[t] and nums[j]
            int temp = nums[t];
            nums[t] = nums[j];
            nums[j] = temp;
        }
        j++;
    }
}
    StringBuilder res=new StringBuilder();
    for(int i:nums){
       res.append(i);
    }
    if(res.length()>1 && res.charAt(0)=='0' && res.charAt(1)=='0') return "0";
    return res.toString();
    }
}
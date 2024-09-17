class NumArray {
    public int a[];
    public NumArray(int[] nums) {
        a=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            a[i]=sum;
        }
    }
    
    public int sumRange(int left, int right) {
        if(left>=1) return a[right]-a[left-1];
        return a[right];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
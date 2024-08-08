class Solution {
    public int removeDuplicates(int[] nums) {
        // Set<Integer> set=new TreeSet<>();
        // for(int i:nums){
        //     set.add(i);
        // }
        // Integer[] array = set.toArray(new Integer[0]);
        // for(int i=0;i<nums.length;i++){
        //     if(i<set.size()) nums[i]=array[i];
        //     else break;
        // }
        // return set.size();
        int p = 1;
        int prev = nums[0];

        for(int i=1; i<nums.length; i++) {
            if(prev != nums[i]) {
                nums[p] = nums[i];
                prev = nums[i];
                p++;
            } 
        }
        return p;
    }
}
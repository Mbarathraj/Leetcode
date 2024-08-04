class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new TreeSet<>();
        for(int i:nums){
            set.add(i);
        }
        Integer[] array = set.toArray(new Integer[0]);
        for(int i=0;i<nums.length;i++){
            if(i<set.size()) nums[i]=array[i];
            else break;
        }
        return set.size();
    }
}
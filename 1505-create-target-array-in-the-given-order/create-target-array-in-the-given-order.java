class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            li.add(index[i],nums[i]);
        }
        int tar[]=new int[li.size()];
        int c=0;
        for(int i:li){
            tar[c++]=i;
        }
        return tar;
    }

}
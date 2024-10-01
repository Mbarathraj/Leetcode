class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean picked[]=new boolean[nums.length];
        HashSet<List<Integer>> res=new HashSet<>();
        permute(res,new ArrayList<>(),picked,nums);
        List<List<Integer>> res1=new ArrayList<>(res);
        return res1;
    }
    void permute(HashSet<List<Integer>> li,List<Integer> temp,boolean []picked,int nums[]){
        if(temp.size()==nums.length){
            li.add(new ArrayList<>(temp));
        }
        for(int i=0;i<nums.length;i++){
            if(!picked[i]){
                temp.add(nums[i]);
                picked[i]=true;
                permute(li,temp,picked,nums);
                picked[i]=false;
                temp.remove(temp.size()-1);
            }
        }
    }
}
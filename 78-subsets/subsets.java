class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        find(nums,0,new ArrayList<>());
        return al;
    }
    List<List<Integer>> al=new ArrayList<>();
    public void find(int []nums,int pos,ArrayList<Integer> li){
        if(pos>=nums.length){ 
            al.add(new ArrayList<>(li));
            return;
        }
        li.add(nums[pos]);
        find(nums,pos+1,li);
        li.remove(li.size()-1);
        find(nums,pos+1,li);
    }
}
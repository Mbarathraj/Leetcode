class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> res=new ArrayList<>();
         permutation(res,new ArrayList<>(),nums);
         return res;
    }
    void permutation(List<List<Integer>> li,List<Integer> temp,int []nums){
        if(temp.size()==nums.length){
            li.add(new ArrayList<>(temp));
            return;
        }
        for(int num:nums){
            if(temp.contains(num)) continue;
            temp.add(num);
            permutation(li,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
}
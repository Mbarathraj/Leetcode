class Solution {
    public int subarraySum(int[] nums, int k) {
     HashMap<Integer,Integer> map=new HashMap<>();
     int sum=0,c=0;
     for(int i:nums){
        sum+=i;
        if(sum==k) c++;
        c+=map.getOrDefault(sum-k,0);
         map.put(sum,map.getOrDefault(sum,0)+1);
     }
     return c;
    }
}
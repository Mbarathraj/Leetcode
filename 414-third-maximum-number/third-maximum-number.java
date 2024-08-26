class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int n[]=new int[set.size()];
        int c=0;
        for(int i:set){
            n[c++]=i;
        }
      Arrays.sort(n);
      return (n.length>=3) ?  n[n.length-3]:n[n.length-1];
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        Set<Integer> set=new LinkedHashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int a[]=new int[set.size()];
        int t=0;
        for(int i:set){
            a[t++]=i;
        }
        int c=1;
        int ma=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]+1==a[i+1]) c++;
            else {
                ma=Math.max(ma,c);
                c=1;
            }
        }
           ma=Math.max(ma,c);
        return ma;
    }
}
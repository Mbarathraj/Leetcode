class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i:nums2) set1.add(i);
        for(int i:nums1) set2.add(i);
        List<List<Integer>> li=new ArrayList<>();
        li.add(new ArrayList<>());
        li.add(new ArrayList<>());
        for(int i:nums1){
            if(set1.add(i)) li.get(0).add(i);
        }
      
        for(int i:nums2){
            if(set2.add(i)) li.get(1).add(i);
        }
        return li;
    }
}
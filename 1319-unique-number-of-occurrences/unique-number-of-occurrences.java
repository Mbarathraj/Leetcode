import java.util.Collection;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Collection<Integer> collection = map.values();
        Set<Integer> set=new HashSet<>(collection);
        System.out.println(map);
        System.out.print(set);
        return set.size()==map.size();
    }
}
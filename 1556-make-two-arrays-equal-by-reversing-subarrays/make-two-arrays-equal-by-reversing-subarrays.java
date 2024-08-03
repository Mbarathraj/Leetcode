class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:target){
            map.put(i,map.getOrDefault(i,0)+1);
        } 
        for(int i:arr){
            if(!map.containsKey(i)) return false;
            else map.put(i,map.getOrDefault(i,0)-1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>=1) return false;
        }
        return true;
    }
}
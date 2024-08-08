class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(numbers[i])){
                return new int[]{map.get(numbers[i]),i+1};
            }
            map.put(target-numbers[i],i+1);
        }
        return new int[]{};
    }
}
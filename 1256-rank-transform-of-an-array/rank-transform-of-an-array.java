class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int []sort=arr.clone();
       Arrays.sort(sort);
       HashMap<Integer,Integer> map=new HashMap<>();
       int rank=1;
       for(int i:sort){
        if(!map.containsKey(i))
         map.put(i,rank++);
       }
       for(int i=0;i<arr.length;i++){
         arr[i]=map.get(arr[i]);
       }
       return arr;
    }
}
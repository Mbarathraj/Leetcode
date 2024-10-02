class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0) return arr;
       int []sort=arr.clone();
       Arrays.sort(sort);
       HashMap<Integer,Integer> map=new HashMap<>();
       int rank=1;
       map.put(sort[0],rank++);
       for(int i=1;i<sort.length;i++){
           if(sort[i]!=sort[i-1])
             map.put(sort[i],rank++);
       }
       for(int i=0;i<arr.length;i++){
         arr[i]=map.get(arr[i]);
       }
       return arr;
    }
}
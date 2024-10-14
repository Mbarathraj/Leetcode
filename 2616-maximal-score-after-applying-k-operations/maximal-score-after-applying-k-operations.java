class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)-> b-a);
       for(int i:nums){
        q.add(i);
       }
       long sum=0;
       while(k-->0){
         int t=q.poll();
         sum+=t;
         q.add((t+2)/3);
       }
       return sum;
    }
}
class KthLargest {
     Queue<Integer> q;
     int k=0;
    public KthLargest(int k, int[] nums) {
       this.k=k;
       q=new PriorityQueue<>();
       for(int i:nums){
         add(i);
       }
    }
    
    public int add(int val) {
       if(q.size()<k || val>q.peek()){
        q.add(val);
        if(q.size()>k){
            q.poll();
        }
       }
       return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
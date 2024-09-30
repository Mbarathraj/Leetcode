class CustomStack {
    int a[];
    int size;
    public CustomStack(int maxSize) {
        a=new int[maxSize];
        size=0;
    }
    
    public void push(int x) {
        if(size>=a.length) return;
        a[size++]=x;
    }
    
    public int pop() {
        if(size<=0) return -1;
        int pE=a[--size];
        return pE;
    }
    
    public void increment(int k, int val) {
        if(size<k){
            for(int i=0;i<size;i++){
                a[i]+=val;
            }
        }
        else{
            for(int i=0;i<k;i++){
                a[i]+=val;
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
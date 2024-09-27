class MyCalendar {
    TreeMap<Integer,Integer> map;
    public MyCalendar() {
        map=new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        map.put(start,map.getOrDefault(start,0)+1);
        map.put(end,map.getOrDefault(end,0)-1);
        int c=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            c+=entry.getValue();
            if(c>1){
                map.put(start,map.get(start)-1);
                map.put(end,map.get(end)+1);
              
                return false;
            }
        }
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
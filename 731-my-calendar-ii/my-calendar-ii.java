class MyCalendarTwo {

    TreeMap<Integer,Integer> map;
    int max;
    public MyCalendarTwo() {
        map=new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        map.put(start,map.getOrDefault(start,0)+1);
        map.put(end,map.getOrDefault(end,0)-1);
        int allow=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            allow+=entry.getValue();
            if(allow > 2){
                map.put(start,map.get(start)-1);
                map.put(end,map.get(end)+1);
                if(map.get(start)==0){
                    map.remove(start);
                }
                if(map.get(end)==0){
                    map.remove(end);
                }
                return false;
            } 
        }
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */
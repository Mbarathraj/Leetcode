
import java.util.TreeMap;

class MyCalendarTwo {

    private TreeMap<Integer, Integer> map;

    public MyCalendarTwo() {
        map = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        map.put(start, map.getOrDefault(start, 0) + 1);
        map.put(end, map.getOrDefault(end, 0) - 1);

        int ongoing = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ongoing += entry.getValue();
            if (ongoing > 2) {
                // Revert the changes
                map.put(start, map.get(start) - 1);
                map.put(end, map.get(end) + 1);
                
                // Clean up the map if any counts are zero
                if (map.get(start) == 0) {
                    map.remove(start);
                }
                if (map.get(end) == 0) {
                    map.remove(end);
                }
                
                return false; // Booking failed due to overlap
            }
        }

        return true; // Booking succeeded
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */



/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */
class Solution {
    public int findMinDifference(List<String> tp) {
        boolean a[]=new boolean[1440];
        for(String t:tp){
            int h=Integer.parseInt(t.substring(0,2));
            int min=Integer.parseInt(t.substring(3));
            h=h*60+min;
            if(a[h]) return 0;
            a[h]=true;
        }
        int prev=-1;
        int fValue=-1;
        int m=Integer.MAX_VALUE;
        for(int cur=0;cur<1440;cur++){
            if(a[cur]){
                if(prev==-1) {
                    fValue=cur;
                }
                 else
                 m=Math.min(m,cur-prev);
            prev=cur;
            }
        }
        if(prev!=-1) m=Math.min(m,1440 + fValue - prev);
        return m;
    }
}
class Solution {
    public int numRescueBoats(int[] p, int l) {
        Arrays.sort(p);
        int i=0,j=p.length-1,c=0;
        while(i<=j){
             c++;
            if(p[i]+p[j]<=l){
                i++;
            }
             j--;
        }
        return c;
    }
}
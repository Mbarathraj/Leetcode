class Solution {
    public int largestAltitude(int[] gain) {
    int sum=0; 
        int maxsum=0;
        for(int i=0; i<gain.length; i++){
            sum=gain[i]+sum;
            maxsum=Math.max(maxsum , sum);
        }
        return maxsum;
    }
}
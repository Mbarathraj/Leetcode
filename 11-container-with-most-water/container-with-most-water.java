class Solution {
    public int maxArea(int[] h) {
        int i=0,j=h.length-1;
        int max=Integer.MIN_VALUE;
        while(i<j){
            int min=Math.min(h[i],h[j]);
            int diff=j-i;
            max=Math.max(max,min*diff);
            if(min==h[i]) i++;
            else j--;
        }
        return max;
    }
}
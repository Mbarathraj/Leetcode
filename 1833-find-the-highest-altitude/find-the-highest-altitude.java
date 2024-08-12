class Solution {
    public int largestAltitude(int[] gain) {
     int max=0,sum=gain[0];
     max=Math.max(max,gain[0]);
     for(int i=1;i<gain.length;i++){
         sum+=gain[i];
         System.out.print(sum+" ");
         max=Math.max(max,sum);
     }
     return  max;
    }
}
class Solution {
    public int[] minOperations(String boxes) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<boxes.length();i++){
           if(boxes.charAt(i)=='1') li.add(i);
        }
        int a[]=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
           int sum=0;
           for(int j:li){
            sum+=Math.abs(j-i);
           }
           a[i]=sum;
        }
        return a;
    }
}
class Solution {
    public int findComplement(int num) {
      String str="";
       int sum=0,i=0;
       while(num>0){
        int r=num%2;
        sum+=(r==0? 1:0)*Math.pow(2,i++);
        num/=2;
       }
        return sum;
    }
}
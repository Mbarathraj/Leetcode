class Solution {
    public int romanToInt(String s) {
        String sym="IVXLCDM";
        int a[]={1,5,10,50,100,500,1000};
        int sum=a[sym.indexOf(s.charAt(s.length()-1))];
        for(int i=s.length()-2;i>=0;i--){
            if(sym.indexOf(s.charAt(i))<sym.indexOf(s.charAt(i+1))){
                sum-=a[sym.indexOf(s.charAt(i))];
            }
            else sum+=a[sym.indexOf(s.charAt(i))];
        }
        return sum;
    }
}
class Solution {
    public String gcdOfStrings(String str1, String str2) {
       String s1=str1+str2;
       String s2=str2+str1;
       if(!s1.equals(s2)) return "";
       return str1.substring(0,gcd(str1.length(),str2.length()));  
    }
    int gcd(int n1,int n2){
         int ma=Math.max(n1,n2);
         int min=Math.min(n1,n2);
         n1=ma;n2=min;
        while(n2!=0){
            int t=n2;
            n2=n1%n2;
            n1=t;
        }
        System.out.print(n1);
        return n1;
    }
}
class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int n1=s.charAt(i)-'a';
            int n2=s.charAt(i+1)-'a';
            sum+=Math.abs(n1-n2);
        }
        return sum;
    }
}
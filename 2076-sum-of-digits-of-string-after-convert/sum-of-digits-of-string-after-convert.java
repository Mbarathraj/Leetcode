class Solution {
    public int getLucky(String s, int k) {
        String st="";
        for(char c:s.toCharArray()){
            st+=c-'a'+1;
        }
        while(k>0){
            int sum=0;
            for(char c:st.toCharArray()){
                sum+=Integer.parseInt(""+c);
            }
            st=""+sum;
            k--;
        }
        return Integer.parseInt(st);
    }
}
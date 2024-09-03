class Solution {
    public int getLucky(String s, int k) {
        StringBuilder st=new StringBuilder();
        for(char c:s.toCharArray()){
            st.append(c-'a'+1);
        }
        while(k>0){
            int sum=0;
            for(char c:st.toString().toCharArray()){
                sum+=Integer.parseInt(""+c);
            }
            st=new StringBuilder();
            st.append(sum);
            k--;
        }
     return Integer.parseInt(st.toString());
    }
}
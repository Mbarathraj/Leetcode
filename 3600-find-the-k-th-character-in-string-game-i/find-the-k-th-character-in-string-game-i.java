class Solution {
    public char kthCharacter(int k) {
        String str="a";
        while(str.length()< k){
            StringBuilder st=new StringBuilder();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i) =='z')
                    st.append('a');
                else  st.append((char)(str.charAt(i)+1));
            }
            str+=st.toString();
        }
        return str.charAt(k-1);
    }
}
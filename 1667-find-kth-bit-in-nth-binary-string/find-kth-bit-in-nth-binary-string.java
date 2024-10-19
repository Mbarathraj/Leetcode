class Solution {
    String invert(String st){
        StringBuilder str=new StringBuilder();
        for(char c:st.toCharArray()){
            if(c=='0') str.append("1");
            else str.append("0");
        }
        return str.toString();
    }
    public char findKthBit(int n, int k) {
        if(n==1 || k==1) return '0';
        StringBuilder str=new StringBuilder("0");
        for(int i=1;i<n;i++){
            String st=str.toString();
            str.append("1");
            str.append(new StringBuilder(invert(st)).reverse());
    }
        return str.charAt(k-1);
    }
}
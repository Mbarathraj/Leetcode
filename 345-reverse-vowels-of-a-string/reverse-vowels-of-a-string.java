class Solution {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        String vow="aeiouAEIOU";
        char c[]=s.toCharArray();
        while(i<j){
            if(vow.contains(""+c[i]) && vow.contains(""+c[j])){
                char c1=c[i];
                c[i]=c[j];
                c[j]=c1;
                i++;
                j--;
            }
            if(!vow.contains(""+c[i])) i++;
            if(!vow.contains(""+c[j])) j--;
        }
    return new String(c);
    }
}
class Solution {
    public String reverseWords(String s) {
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);
        }
        String a[]=str.split(" ");
        s="";
        for(int i=a.length-1;i>=0;i--){
            s+=a[i]+" ";
        }
        return s.trim();
    }
}
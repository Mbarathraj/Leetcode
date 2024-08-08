class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String str="";
        String a[]=s.split(" ");
        for(int i=a.length-1;i>=0;i--){
            if(!a[i].isEmpty()) str+=a[i]+" "; 
        }
        return str.trim();
    }
}
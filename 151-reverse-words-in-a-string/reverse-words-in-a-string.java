class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder str=new StringBuilder();
        String a[]=s.split(" ");
        for(int i=a.length-1;i>=0;i--){
            if(!a[i].isEmpty()) str.append(a[i]+" "); 
        }
        return str.toString().trim();
    }
}
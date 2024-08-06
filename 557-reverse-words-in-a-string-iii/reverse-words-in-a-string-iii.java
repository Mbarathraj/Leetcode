class Solution {
    String make(String str){
        char c[]=str.toCharArray();
        int i=0,j=c.length-1;
        while(i<j){
            char c1=c[i];
            c[i]=c[j];
            c[j]=c1;
            i++;j--;
        }
        String st=new String(c);
        return st;
    }
    public String reverseWords(String s) {
        // String str="";
        // for(int i=s.length()-1;i>=0;i--){
        //     str+=s.charAt(i);
        // }
        // String a[]=str.split(" ");
        // s="";
        // for(int i=a.length-1;i>=0;i--){
        //     s+=a[i]+" ";
        // }
        // return s.trim();
        String st="";
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1) st+=make(arr[i]);
            else st+=make(arr[i])+" ";
        }
        return st;
    }
}
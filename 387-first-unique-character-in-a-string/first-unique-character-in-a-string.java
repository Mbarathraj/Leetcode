class Solution {
    public int firstUniqChar(String s) {
        int a[]=new int[256];
        // for(int i=0;i<s.length();i++){
        // if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) return i;
        // }
        for(char c:s.toCharArray()){
            a[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(a[s.charAt(i)-'a']==1)  return i;
        }
        return -1;
    }
}
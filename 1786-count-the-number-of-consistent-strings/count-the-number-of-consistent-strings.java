class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int a[]=new int[26];
        for(char c:allowed.toCharArray()){
            a[c-'a']++;
        }
        int count=0;
        for(String word:words){
            boolean flag=true;
            for(char c:word.toCharArray()){
                if(a[c-'a']==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true) count++;
        }
        return count;
    }
}
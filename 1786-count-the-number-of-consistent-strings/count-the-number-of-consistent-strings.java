class Solution {
    boolean find(String word,int a[]){
           for(char c:word.toCharArray()){
                if(a[c-'a']==0){
                    return false;
                }
            }
            return true;
    }
    public int countConsistentStrings(String allowed, String[] words) {
        int a[]=new int[26];
        for(char c:allowed.toCharArray()){
            a[c-'a']++;
        }
        int count=0;
        for(String word:words){
           if(find(word,a)) count++;
        }
        return count;
    }
}
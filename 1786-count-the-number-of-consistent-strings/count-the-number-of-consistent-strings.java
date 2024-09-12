class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        ArrayList<Character> al=new ArrayList<>();
        for(char c:allowed.toCharArray()){
            al.add(c);
        }
        int c1=0;
        for(int i=0;i<words.length;i++){
            boolean flag=true;
            int f=0,l=words[i].length()-1;
            while(f<=l){
                if(!al.contains(words[i].charAt(f)) || !al.contains(words[i].charAt(l))){
                    flag=false;
                    break;
                }
                f++;
                l--;
            }
            if(flag) c1++;
        }
        return c1;
    }
}
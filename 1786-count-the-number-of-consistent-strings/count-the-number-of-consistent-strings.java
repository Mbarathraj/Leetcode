class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        ArrayList<Character> al=new ArrayList<>();
        for(char c:allowed.toCharArray()){
            al.add(c);
        }
        int c1=0;
        for(int i=0;i<words.length;i++){
            boolean flag=true;
            for(char c:words[i].toCharArray()){
                if(!al.contains(c)){
                    flag=false;
                    break;
                }
            }
            if(flag) c1++;
        }
        return c1;
    }
}
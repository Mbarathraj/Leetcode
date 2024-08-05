class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder str=new StringBuilder();
        for(String word:words){
            str.append(word.charAt(0));
        }
        return s.equals(str.toString());
    }
}
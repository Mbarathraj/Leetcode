class Solution {
    public String sortSentence(String s) {
        String[] sortedArray = sortingSen(s);

        return String.join(" ",sortedArray);      
    }

    public String[] sortingSen(String str) {
        String[] strArray = str.split(" ");
        String[] fStr = new String[strArray.length];
        
        for (String word : strArray) {
            int indx = word.charAt(word.length()-1)- '0';
            fStr[indx-1] = word.substring(0,word.length()-1);
        }
        return fStr;
    }
}
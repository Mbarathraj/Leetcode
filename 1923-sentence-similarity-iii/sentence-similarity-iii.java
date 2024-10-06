class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {
        if(s1.length()>s2.length()){
           return areSentencesSimilar(s2,s1);
        }
        String min[]=s1.split(" ");
        String max[]=s2.split(" ");
        int start=0;
        int end1=min.length-1;
        int end2=max.length-1;
        while(start<=end1 && min[start].equals(max[start])){
            start++;
        }
        while(start<=end1 && min[end1].equals(max[end2])){
            end1--;end2--;
        }
        return start > end1;

        

    }
}
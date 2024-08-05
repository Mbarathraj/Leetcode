class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int kPos=0;
        switch(ruleKey){
            case "type":
                kPos=0;
                break;
            case "color":
                kPos=1;
                break;
            case "name":
                kPos=2;
                break;
        }
        int c=0;
        for(List<String> li:items){
            if(li.get(kPos).equals(ruleValue)){
                c++;
            }
        }
        return c;
    }
}
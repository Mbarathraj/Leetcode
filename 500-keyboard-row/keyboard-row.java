class Solution {
    public String[] findWords(String[] words) {
        String f="qwertyuiopQWERTYUIOP";
        String s="asdfghjklASDFGHJKL";
        String t="zxcvbnmZXCVBNM";
        ArrayList<String> li=new ArrayList<>();
        int a[]=new int[words.length];
        for(String word:words){
            int fr=0,sr=0,tr=0;
            for(char c:word.toCharArray()){
                if(f.contains(""+c)) fr++;
                else if(s.contains(""+c)) sr++;
                else tr++;
            }
            if(fr>0 && sr>0 || fr>0 && tr>0 || sr>0 && tr>0) continue;
            else li.add(word);
            
        }
          String []arr=new String[li.size()];
          int i=0;
          for(String st:li){
            arr[i++]=st;
          }
          return arr;
    }
}
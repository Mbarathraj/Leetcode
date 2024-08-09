class Solution {
    public int compress(char[] chars) {
        int c=1;
        String str="";
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]) c++;
            else {
                if(c>1)
                 str+=chars[i-1]+""+c;
                else  str+=chars[i-1];
                c=1;
            }
        }
        if(c>1)
          str+=chars[chars.length-1]+""+c;
        else  str+=chars[chars.length-1];
        int k=0;
        for(char c1:str.toCharArray()){
            chars[k++]=c1;
        }
        return k;

    }
}
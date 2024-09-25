class Solution {
    public String capitalizeTitle(String title) {
        String a[]=title.split(" ");
        int t1=0;
        for(String t:a){
            if(t.length()>2) {
                char c[]=t.toCharArray();
                c[0]=Character.toUpperCase(c[0]);
                for(int i=1;i<c.length;i++){
                    c[i]=Character.toLowerCase(c[i]);
                }
                a[t1]=new String(c);
            }
            else{
                if(t.length()==1) a[t1]=""+Character.toLowerCase(t.charAt(0));
                else a[t1]=""+Character.toLowerCase(t.charAt(0))+Character.toLowerCase(t.charAt(1));
            }
          t1++;
        }

        return String.join(" ",a);
    }
}
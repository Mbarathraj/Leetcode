class Solution {
    public String sortVowels(String s) {
        StringBuilder st=new StringBuilder();
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='A' || a[i]=='E' || a[i]=='I' || a[i]=='O' || a[i]=='U' ||
               a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u'  ){
                st.append(a[i]);
                a[i]=' ';
            }
        }
        char a1[]=st.toString().toCharArray();
         Arrays.sort(a1);
        int k=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==' '){
                a[i]=a1[k++];
            }
        }
        return new String(a);
    }
}
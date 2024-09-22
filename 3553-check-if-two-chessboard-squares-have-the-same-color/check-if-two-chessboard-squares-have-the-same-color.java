class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        boolean a[][]=new boolean[8][8];
        boolean fl=false;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                a[i][j]=fl;
                fl=!fl;
            }
            fl=!fl;
        }
        return a[c1.charAt(0)-'a'][c1.charAt(1)-'0'-1]==a[c2.charAt(0)-'a'][c2.charAt(1)-'0'-1] ? true:false;
    }
}
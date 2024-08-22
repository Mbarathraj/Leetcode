class Solution {
    public int findComplement(int num) {
        String str=Integer.toBinaryString(num);
        System.out.print(str);
        String res="";
        for(char c:str.toCharArray()){
            res+=c == '0' ? '1':'0';
        }
         System.out.print(str);
        int n=Integer.parseInt(res,2);
        return n;
    }
}
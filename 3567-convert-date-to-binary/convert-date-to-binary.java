class Solution {
    public String convertDateToBinary(String date) {
        String arr[]=date.split("-");
        StringBuilder str=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            int n=Integer.parseInt(arr[i]);
            str.append(Integer.toBinaryString(n)).append("-");
        }
        return str.toString().substring(0,str.length()-1);
    }
}
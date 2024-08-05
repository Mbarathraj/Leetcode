class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashSet<String> hs=new LinkedHashSet<>();
        ArrayList<String> al=new ArrayList<>();
        for(String st:arr){
            if(!hs.contains(st)) al.add(st);
            else al.remove(st);
            hs.add(st);
        }
        return k<=al.size() ? al.get(k-1):"";
    }
}
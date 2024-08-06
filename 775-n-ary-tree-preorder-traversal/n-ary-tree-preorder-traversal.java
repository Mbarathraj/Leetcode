/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    ArrayList<Integer> al=new ArrayList<>();
    public void preOrder(Node root){
        if(root==null) return;
        al.add(root.val);
        for(Node li:root.children){
                preOrder(li);
        }
    } 
    public List<Integer> preorder(Node root) {
        preOrder(root);
        return al;
    }
}
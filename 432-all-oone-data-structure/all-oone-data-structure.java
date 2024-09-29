class Node{
    Node prev;
    Node next;
    HashSet<String> set;
    int freq;
    Node(int f){
        freq=f;
        prev=next=null;
        set=new HashSet<>();
    }
}
class AllOne {
    Node head;
    Node tail;
    HashMap<String,Node> map;
    public AllOne() {
        map=new HashMap<>();
        head=new Node(0);
        tail=new Node(0);
        head.next=tail;
        tail.prev=head;
    }
    
    public void inc(String key) {
        Node cur=head;
        int newFreq=1;
        if(map.containsKey(key)){
            cur=map.get(key);
            newFreq =cur.freq+1;
            cur.set.remove(key);
        }
        if(cur.next.freq==newFreq){
            cur.next.set.add(key);
        }
        else{
            Node node=new Node(newFreq);
            node.set.add(key);
            Node nextNode=cur.next;
            node.next=nextNode;
            nextNode.prev=node;
            cur.next=node;
            node.prev=cur;

        }
        map.put(key,cur.next);
        if(cur.set.size()==0 && cur!=head){
            removeNode(cur);
        }

    }
    
    public void dec(String key) {
        Node cur=map.get(key);
        int newFreq=cur.freq-1;
        cur.set.remove(key);
        if(newFreq==0) {
            if(cur.set.size()==0){
                removeNode(cur);
            }
            map.remove(key);
            return;
        }
        if(cur.prev.freq==newFreq){
            cur.prev.set.add(key);
        }
        else{
            Node node=new Node(newFreq);
            node.set.add(key);
            Node prevNode= cur.prev;
            node.prev=prevNode;
            prevNode.next=node;
            node.next=cur;
            cur.prev=node;

        }
        map.put(key,cur.prev);
        if(cur.set.size()==0 && cur!=head){
            removeNode(cur);
        }
    }
    
    public String getMaxKey() {
        if(tail.prev==head) return "";
        return tail.prev.set.iterator().next();
    }
    
    public String getMinKey() {
        if(head.next==tail) return "";
        return head.next.set.iterator().next();
    }
    private void removeNode(Node cur){
        Node prevNode=cur.prev;
        Node nextNode=cur.next;
        prevNode.next=nextNode;
        nextNode.prev=prevNode;
        cur.next=null;
        cur.prev=null;
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */
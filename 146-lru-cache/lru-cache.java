class LRUCache {
    class Node{
        int key,value;
        Node next,prev;
        Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    private int capacity;
    private Map<Integer,Node> h;
    private Node head,tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        h = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }
    public void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public void insert(Node node){
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
    public int get(int key) {
        if(!h.containsKey(key)) return -1;
        Node node = h.get(key);
        remove(node);
        insert(node);
        return node.value; 
    }
    public void put(int key, int value) {
        if(h.containsKey(key)) remove(h.get(key));
        Node node = new Node(key,value);
        h.put(key,node);
        insert(node);
        if(h.size() > capacity){
            Node lru = tail.prev;
            remove(lru);
            h.remove(lru.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
class MyHashMap {
    class Node{
        int key,data;
        Node next;
        Node(int key,int data){
            this.key = key;
            this.data = data;
        }
    }
    private final int SIZE = 1000;
    private Node[] buckets;
    public MyHashMap() {
        buckets = new Node[SIZE];
    }
    private int hash(int key){
        return key%SIZE;
    }
    public void put(int key, int data) {
        int index = hash(key);
        Node head = buckets[index];
        Node curr = head;
        while(curr != null){
            if(curr.key == key){
                curr.data = data;
                return;
            }
            curr = curr.next;
        }
        Node newNode = new Node(key,data);
        newNode.next = head;
        buckets[index] = newNode;
    }
    public int get(int key) {
        int index = hash(key);
        Node head = buckets[index];
        Node curr = head;
        while(curr != null){
            if(curr.key == key){
                return curr.data;
            }
            curr = curr.next;
        }
        return -1;
    } 
    public void remove(int key) {
        int index = hash(key);
        Node head = buckets[index];
        Node curr = head;
        Node prev = null;
        while(curr != null){
            if(curr.key == key){
                if(prev == null){
                    buckets[index] = curr.next;
                }else{
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
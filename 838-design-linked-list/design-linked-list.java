class MyLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    private Node head;
    private int size;
    public MyLinkedList() {
        head = new Node(0);
        size = 0;
    }
    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        Node curr = head.next;
        for(int i=0;i<index;i++){
            curr = curr.next;
        }
        return curr.data;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) return;
        Node curr = head;
        for(int i=0;i<index;i++){
            curr = curr.next;
        }
        Node newNode = new Node(val);
        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;
        Node curr = head;
        for(int i=0;i<index && curr.next != null;i++){
            curr = curr.next;
        }
        // if(curr.next.next == null || curr.next == null) return;
        curr.next = curr.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
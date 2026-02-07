/**
 * Definition for singly-linked list.
 * public class ListListNode {
 *     int val;
 *     ListListNode next;
 *     ListListNode() {}
 *     ListListNode(int val) { this.val = val; }
 *     ListListNode(int val, ListListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    static int len(ListNode head){
        ListNode curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        int len = len(head);
        ListNode curr = head;
        for(int i=0;i<len/2-1;i++){
            curr = curr.next;
        }
        if(curr == null || curr.next == null){
            curr = null;
        }else curr.next = curr.next.next;
        return head;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode findMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public void reorderList(ListNode head) {
        ListNode mid=findMid(head);
        ListNode right=mid.next;
        mid.next=null;
        ListNode cur=right;
        ListNode prev=null;
        ListNode next;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        ListNode LH=head;
        ListNode RH=prev;
        ListNode nextr;
        ListNode nextl;
        while(LH!=null && RH!=null){
            nextl=LH.next;
            LH.next=RH;
            nextr=RH.next;
            RH.next=nextl;
            LH=nextl;
            RH=nextr;
        }
    }
}
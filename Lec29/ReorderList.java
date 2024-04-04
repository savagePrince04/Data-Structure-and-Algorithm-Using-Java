package Lec29;

public class ReorderList {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    class Solution {
        public void reorderList(ListNode head) {
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            ListNode prev=null;
            ListNode current = slow;
            while(current!=null){
                ListNode next=current.next;
                current.next=prev;
                prev=current;
                current=next;
            }
            ListNode first=head;
            ListNode second=prev;
            while(second.next!=null){
                ListNode temp = first.next;
                first.next=second;
                first = temp;

                temp=second.next;
                second.next=first;
                second=temp;
            }
        }
    }
}

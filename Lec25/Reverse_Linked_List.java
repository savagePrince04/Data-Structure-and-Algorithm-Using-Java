package Lec25;

public class Reverse_Linked_List {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) {
              this.val = val;
          }
          ListNode(int val, ListNode next) {
              this.val = val; this.next = next;
          }
      }
    class Solution {
        public ListNode reverseList(ListNode head) {
            return Reversed(head,null);
        }
        public ListNode Reversed(ListNode curr,ListNode prev){
            if(curr==null){
                return prev;
            }
            ListNode temp=Reversed(curr.next,curr);
            curr.next=prev;
            return temp;
        }
    }
}

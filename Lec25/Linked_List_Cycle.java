package Lec25;

public class Linked_List_Cycle {
    // this the leetcode Driver code
      class ListNode {
          int val;
          ListNode next;
         ListNode(int x) {
              val = x;
              next = null;
          }
      }
      // main logic are given below copy the below and pest on leet code it will run
    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    return true;
                }
            }
            return false;
        }
    }
}

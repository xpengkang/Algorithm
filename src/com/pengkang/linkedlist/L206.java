package pengkang.linkedlist;

public class L206 {
}
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
    public ListNode reverseList(ListNode head) {
        if(head ==null || head.next == null)return head;//边界条件

        ListNode prev = null;
        ListNode cur = head;

        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev; //就这一个是反转。cur.next 的指向，改了。cur指向pre....
            prev = cur;//这两个是后移
            cur = next;
        }
        return prev;
    }
}
package pengkang.linkedlist.dummyHead;

public class L2 {
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int carry = 0;
        while(l1 != null || l2 !=null){


            int x = l1 == null ? 0: l1.val;
            int y = l2 == null ? 0: l2.val;

            int sum =  x + y + carry;

            carry = sum/10;
            sum = sum % 10;

            //赋值
            cur.next = new ListNode(sum);


            //三个指针后移
            cur = cur.next;

            if(l1 != null) {

                l1 = l1.next;
            }

            if(l2 != null) {

                l2 = l2.next;
            }

        }

        if(carry == 1){
            cur.next = new ListNode(carry);
        }

        return dummy.next;
    }
}
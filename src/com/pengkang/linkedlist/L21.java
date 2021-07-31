package pengkang.linkedlist;

public class L21 {
}
/**
 * Definition for singly-linked list.
 */
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //递归
        // if(l1 == null)return l2;
        // if(l2 == null) return l1;
        // if(l1.val < l2.val){
        //     l1.next = mergeTwoLists(l1.next,l2);
        //     return l1;
        // }else{
        //     l2.next = mergeTwoLists(l1,l2.next);
        //     return l2;
        // }

        ListNode head = new ListNode(0);
        ListNode dummy = head;


        while(l1 != null && l2 != null){
            if(l1.val< l2.val){
                dummy.next = l1;
                l1 = l1.next;
                // l2 = l2.next;

            }else{
                dummy.next = l2;

                l2 = l2.next;
            }
            // l1 = l1.next;
            // l2 = l2.next;
            dummy = dummy.next;
        }

        if(l1 != null){
            dummy.next = l1;//整个剩余链表直接挂在尾部

        }

        if(l2 != null){
            dummy.next = l2;

        }
        return head.next;//为什么是head..head是0， head.next才是我们想要的

    }
}
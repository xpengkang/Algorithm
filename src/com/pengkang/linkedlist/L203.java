package com.pengkang.linkedlist;

/**
 * Definition for singly-linked list.
 */


class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
//         if(head ==null) return head;
//         while(head != null && head.val == val){// 7,7,7,7
//             ListNode delNode = head;
//             head = delNode.next;
//         }
//         if(head == null) return null;
        
//         ListNode cur = head;
//         while(cur.next != null){
//             if(cur.next.val == val){
//                 ListNode delNode = cur.next;
//                 cur.next = delNode.next;
                
//             }else{
//                 cur = cur.next;
//             }        
//         }
//         return head;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        //2.设立虚拟头节点
        if(head ==null) return head;
        
        
        ListNode cur = dummyHead;
        while(cur.next != null){
            if(cur.next.val == val){
                ListNode delNode = cur.next;
                cur.next = delNode.next;
                
            }else{
                cur = cur.next;
            }        
        }
        return dummyHead.next;
    }
}
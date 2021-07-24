package com.pengkang.linkedlist;

public class TestCreateLinkedList {
    public static void main(String[] args) {

    }

    ListNode createLinkedList(int[] arr, int n){
        ListNode head = new ListNode(arr[0]);
        ListNode curNode = head;
        for (int i = 1; i < n; i++) {
            curNode.next = new ListNode(arr[i]);
            curNode = curNode.next;
        }


        return head;
    }


}

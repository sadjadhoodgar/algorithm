package org.train.linked_list;

/**
 * LeetCode #206 - Reverse Linked List
 * Link: <a href="https://leetcode.com/problems/reverse-linked-list/">...</a>
 */
public class LinkedListReversal {
    public ListNode solution(ListNode head) {
        var current = head;
        ListNode prv = null;

        while(current != null){
            ListNode tmp = current.next;
            current.next = prv;
            prv = current;
            current = tmp;
        }
        return prv;
    }
}
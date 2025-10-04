package org.train.linked_list;

/**
 * LeetCode #206 - Reverse Linked List
 * Link: <a href="https://leetcode.com/problems/reverse-linked-list/">...</a>
 */
public class LinkedListReversal {
    public LinkedListNode solution(LinkedListNode head) {
        var current = head;
        LinkedListNode prv = null;

        while(current != null){
            LinkedListNode tmp = current.next;
            current.next = prv;
            prv = current;
            current = tmp;
        }
        return prv;
    }
}
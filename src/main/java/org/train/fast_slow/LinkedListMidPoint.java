package org.train.fast_slow;

import org.train.linked_list.ListNode;

/**
 * LeetCode #876. Middle of the Linked List
 * Link: <a href="https://leetcode.com/problems/middle-of-the-linked-list/">...</a>
 */
public class LinkedListMidPoint {
    ListNode solution(ListNode head){
        if(head == null){
            return null;
        }

        var slow = head;
        var fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

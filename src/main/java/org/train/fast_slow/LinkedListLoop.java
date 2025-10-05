package org.train.fast_slow;

import org.train.linked_list.LinkedListNode;

/**
 * LeetCode #141 - Linked List Cycle
 * Link: <a href="https://leetcode.com/problems/linked-list-cycle/">...</a>
 */
public class LinkedListLoop {
    public boolean solution(LinkedListNode head) {
        var slow = head;
        var fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}

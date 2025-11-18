package org.train.fast_slow;


import org.train.linked_list.ListNode;

/**
 * LeetCode #141 - Linked List Cycle
 * Link: <a href="https://leetcode.com/problems/linked-list-cycle/">...</a>
 */
public class LinkedListLoop {
    public boolean solution(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }
}

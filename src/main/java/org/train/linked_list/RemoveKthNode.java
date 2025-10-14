package org.train.linked_list;

/**
 * LeetCode #206 - Reverse Linked List
 * Link: <a href="https://leetcode.com/problems/reverse-linked-list/">...</a>
 */
public class RemoveKthNode {
    public LinkedListNode solution(LinkedListNode head, int k) {
        if (head == null) {
            return null;
        }

        var dummy = new LinkedListNode(-1);
        dummy.next = head;

        var car = dummy;
        var trailer = dummy;

        for (int i = 0; i < k + 1; i++) {
            car = car.next;
            if (car == null) {
                return head;
            }
        }

        while (car.next != null) {
            car = car.next;
            trailer = trailer.next;
        }

        trailer.next = trailer.next.next;

        return dummy.next;
    }
}

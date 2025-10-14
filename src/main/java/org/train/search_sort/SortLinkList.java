package org.train.search_sort;

import org.train.linked_list.ListNode;

/**
 * LeetCode #148. Sort List
 * Link: <a href="https://leetcode.com/problems/sort-list/">...</a>
 */
public class SortLinkList {
    public ListNode solution(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        var secondHead = split(head);

        var firsSorted = solution(head);
        var secondSorted = solution(secondHead);

        return sortAndMerge(firsSorted, secondSorted);
    }

    ListNode split(ListNode head) {
        var slow = head;
        var fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        var secondHead = slow.next;
        slow.next = null;
        return secondHead;
    }

    ListNode sortAndMerge(ListNode first, ListNode second) {
        var dummy = new ListNode(0);
        var tail = dummy;

        while (first != null && second != null) {
            if (first.val < second.val) {
                tail.next = first;
                first = first.next;
            } else {
                tail.next = second;
                second = second.next;
            }
            tail = tail.next;
        }

        tail.next = (first != null) ? first : second;
        return dummy.next;
    }
}

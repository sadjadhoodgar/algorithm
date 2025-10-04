package org.train.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListReversalTest {

    LinkedListReversal underTest = new LinkedListReversal();

    public static LinkedListNode createSampleList() {
        LinkedListNode head = new LinkedListNode(1);
        head.next = new LinkedListNode(2);
        head.next.next = new LinkedListNode(3);
        head.next.next.next = new LinkedListNode(4);
        head.next.next.next.next = new LinkedListNode(5);
        return head;
    }

    @Test
    void solution() {
        LinkedListNode head = createSampleList();


        LinkedListNode reversed = underTest.solution(head);

        int[] expected = {5, 4, 3, 2, 1};
        int i = 0;
        LinkedListNode current = reversed;
        while (current != null) {
            assertEquals(expected[i++], current.value);
            current = current.next;
        }
    }
}
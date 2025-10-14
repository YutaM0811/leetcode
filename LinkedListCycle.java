import java.util.*;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> n = new HashSet<>();
        while (head != null) {
            if (n.contains(head)) {
                return true;
            }
            n.add(head);
            head = head.next;
        }
        return false;
    }
}

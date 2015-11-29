package linkedlist;

/**
 * Created by fuqunchao on 15/11/29.
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode prev = head;
        ListNode p = head.next;
        prev.next = null;
        ListNode nxt;

        while (p != null) {
            nxt = p.next;
            p.next = prev;
            prev = p;
            p = nxt;
        }

        return prev;
    }
}

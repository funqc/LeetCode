package linkedlist;

/**
 * Created by fuqunchao on 15/11/29.
 */
public class DeletDuplicates {
    /**
     * Given a sorted linked list, delete all duplicates such that each element appear only once
     */

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode prev = head;
        ListNode p = head.next;

        while (p != null){
            if (p.val == prev.val){
                prev.next = p.next;
                p = p.next;
            }else {
                prev = p;
                p = p.next;
            }
        }
        return head;
    }
}

public class TwoNumbersAdd2 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3;
        ListNode tempnode = new ListNode(0);
        ListNode pre = null;
        l3 = tempnode;
        int add = 0;
        while (!(l1 == null && l2 == null)) {
            int temp = 0;
            temp = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + add;
            add = temp / 10;
            temp = temp % 10;
            tempnode.val = temp;
            pre = tempnode;
            tempnode.next = new ListNode(0);
            tempnode = tempnode.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if (add != 0) {
            tempnode.val = add;
        }
        if (tempnode.val == 0) {
            assert pre != null;
            pre.next = null;
        }
        return l3;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
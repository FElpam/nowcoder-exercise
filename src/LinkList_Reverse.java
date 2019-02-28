public class LinkList_Reverse {
    public ListNode ReverseList(ListNode head) {
        ListNode newHead;
        ListNode pre, curr, succ;
        if (head == null) return null;
        else if (head.next == null) return head;
        else {
            pre = head;
            curr = head.next;
            succ = curr.next;
            while (succ != null) {
                curr.next = pre;
                pre = curr;
                curr = succ;
                succ = succ.next;
            }
            curr.next = pre;
            head.next = null;
        }
        return curr;
    }

    public void test(){
        int[] arr = {1,2,3};
        ListNode link = ListNode.newList(new int[]{1, 2, 3});
        ListNode reverseLink = ReverseList(link);
        ListNode.printList(reverseLink);
    }
}

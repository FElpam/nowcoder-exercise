public class LinkList_Merge {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode head;
        if (list1.val > list2.val) {
            head = list2;
            list2 = list2.next;
        } else {
            head = list1;
            list1 = list1.next;
        }
        ListNode temp = head;

        while (list1 != null && list2 != null) {

            if (list1.val > list2.val) {
                temp.next = list2;
                list2 = list2.next;
            }
            else {
                temp.next = list1;
                list1 = list1.next;
            }
            temp = temp.next;
        }
        if (list1 == null) temp.next = list2;
        else temp.next = list1;
        return head;
    }
    public void test(){
        ListNode list1 = ListNode.newList(new int[]{1, 3, 5});
        ListNode list2 = ListNode.newList(new int[]{6, 7, 8});
        ListNode nullList = null;
        ListNode list = Merge(list1, list2);
        ListNode.printList(list);
    }
}

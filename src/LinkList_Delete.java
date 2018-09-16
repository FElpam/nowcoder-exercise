/*
    其他思路：用递归做
 */

public class LinkList_Delete {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) return null;
        while (pHead != null) {
            if (hasDuplication(pHead)) {
                pHead = listAfterDeletetion(pHead);
            }
            else break;
        }
        if (pHead == null) return null;

        ListNode nextNode = pHead.next;
        ListNode prevNode = pHead;
        while (nextNode != null){
            if (hasDuplication(nextNode)) {
                nextNode = listAfterDeletetion(nextNode);
                prevNode.next = nextNode;
            }
            else {
                prevNode = nextNode;
                nextNode = nextNode.next;
            }
        }

        return pHead;
    }

    // 只有node不为空才调用该函数
    public boolean hasDuplication(ListNode node){
        if (node.next == null || node.val != node.next.val) return false;
        return true;
    }

    // This function is called only if the node hasDuplication
    public ListNode listAfterDeletetion(ListNode node){
        ListNode pointer = node.next;
        while (pointer != null && pointer.val == node.val){
            pointer = pointer.next;
        }
        return pointer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 3, 4, 4, 5};
        ListNode list = ListNode.getList(arr);
        ListNode.printList(list);
        ListNode result = new LinkList_Delete().deleteDuplication(list);
        ListNode.printList(result);
    }
}

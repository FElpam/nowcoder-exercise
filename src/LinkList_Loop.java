public class LinkList_Loop {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) return null;
        ListNode[] listNodes = new ListNode[10000];
        int count = 0;
        int i;
        listNodes[count] = pHead;
        while (pHead.next != null) {
            pHead = pHead.next;
            for (i = 0; i <= count; i++) {
                if (listNodes[i] == pHead) return pHead;
            }
            count++;
            listNodes[count] = pHead;
        }
        return null;
    }

    public void test() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node2;

        ListNode result = EntryNodeOfLoop(node1);
        System.out.println(result.val);
    }
}

/*
    其他思路：让两个指针一前一后同时前进，当两个指针第一次指向同一个节点时，这个点就是入口节点
 */
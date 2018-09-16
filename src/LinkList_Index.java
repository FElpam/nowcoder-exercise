/*
    输入一个链表，输出该链表中倒数第k个结点。
 */
import java.util.ArrayList;

public class LinkList_Index {
    public ListNode FindKthToTail(ListNode head,int k) {
        ArrayList<ListNode> list = new ArrayList<>();
        if (head == null || k <= 0) return null;
        while(head != null){
            list.add(head);
            head = head.next;
        }
        if (list.size() < k) return null;
        return list.get(list.size() - k);
    }

    public void test(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode result = FindKthToTail(node1, 1);
        System.out.println(result.val);
    }
}

/*
    其他思路：可以将指针移到第k个节点，再新建一个指针和该指针同时移动，直到前一个指针到达末尾
 */
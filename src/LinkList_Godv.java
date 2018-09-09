import java.util.ArrayList;

public class LinkList_Godv {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode p = listNode;
        while (null != p){
            arr.add(0, p.val);
            p = p.next;
        }
        return arr;
    }
}

/*
 *  可以使用递归的方法来做
 *  */




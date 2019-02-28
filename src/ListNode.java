public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    public static void printList(ListNode head){
        ListNode pointer = head;
        while(pointer != null){
            System.out.format("%d ", pointer.val);
            pointer = pointer.next;
        }
        System.out.println();
    }

    public void printVal(){
        System.out.println("val = " + val);
    }

    public static ListNode newList(int[] arr){
        if (arr.length == 0) throw new RuntimeException("Empty Array!");
        ListNode nextNode = new ListNode(arr[arr.length - 1]);
        ListNode head = nextNode;
        for (int count = arr.length - 2; count >= 0; count --){
            head = new ListNode(arr[count]);
            head.next = nextNode;
            nextNode = head;
        }
        return head;
    }
}


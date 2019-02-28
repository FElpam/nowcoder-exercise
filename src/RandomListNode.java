import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }

    public static RandomListNode newList(int[] arr, int[] rand){
        if (arr.length == 0) return null;
        List<RandomListNode> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i ++) {
            RandomListNode node = new RandomListNode(arr[i]);
            list.add(node);
        }

        for (int i = 0; i < arr.length - 1; i ++) {
            list.get(i).next = list.get(i + 1);
        }
        for (int i = 0; i < arr.length; i ++) {
            if (rand[i] >= 0) {
                list.get(i).random = list.get(rand[i] - 1);
            }
            else list.get(i).random = null;
        }
        System.out.println("---");
        printList(list.get(0));
        System.out.println("---");
        return list.get(0);
    }

    public static void printList(RandomListNode head) {
        while (head != null) {
            System.out.print("label = " + head.label + " random = ");
            if (head.random == null) System.out.println("null");
            else System.out.println(head.random.label);
            head = head.next;
        }
    }
}
public class RandomList_Clone {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if (pHead == null) return null;
        RandomListNode currentNode = pHead;
        while (currentNode != null){
            RandomListNode newNode = new RandomListNode(currentNode.label);
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            currentNode = newNode.next;
        }
        currentNode = pHead;
        while (currentNode != null) {
            if (currentNode.random != null) {
                currentNode.next.random = currentNode.random.next;
            }
            currentNode = currentNode.next.next;
        }

        RandomListNode newHead = pHead.next;
        currentNode = pHead;
        RandomListNode temp;
        while (currentNode.next != null) {
            temp = currentNode.next;
            currentNode.next = temp.next;
            currentNode = temp;
        }
        return newHead;
    }

    public void test() {
        RandomListNode head = RandomListNode.newList(new int[]{1, 2, 3, 4, 5}, new int[]{3, 5, -1, 2, -1});
        RandomListNode newList = Clone(head);
        RandomListNode.printList(newList);
    }
}

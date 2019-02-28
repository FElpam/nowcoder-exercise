import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Stack_Min {
    List<Integer> list = new ArrayList();
    Stack<Integer> stack = new Stack();

    public void push(int node) {
        stack.push(node);
        int i = 0;
        for (; i < list.size(); i ++) {
            if (list.get(i) > node) break;
        }
        list.add(i, node);
    }

    public void pop() {
        list.remove(stack.pop());
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return list.get(0);
    }

    public void printPeek(){
        System.out.println(stack.peek());
    }

    public void test() {
        Stack_Min stack = new Stack_Min();
        stack.push(3);
        System.out.println(stack.min());
//        stack.push(4);
//        stack.min();
//        stack.push(2);
//        stack.min();
//        stack.push(3);
//        stack.min();
//        stack.pop();
//        stack.printPeek();
    }
}

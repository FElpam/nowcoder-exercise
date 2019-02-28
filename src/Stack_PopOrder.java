import java.util.Stack;

public class Stack_PopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int cur = 0;
        for (int i = 0; i < pushA.length; i ++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek() == popA[cur]) {
                stack.pop();
                cur ++;
            }
        }
        return stack.isEmpty();
    }

}

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args){
        Stack_SimulateQueue queue = new Stack_SimulateQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.pop());
        queue.push(4);
        queue.push(5);
        queue.push(6);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

    }
}

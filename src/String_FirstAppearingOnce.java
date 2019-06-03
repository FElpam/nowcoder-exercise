import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

public class String_FirstAppearingOnce {
    HashMap<Character, Integer> map = new HashMap<>();
    LinkedBlockingQueue<Character> order = new LinkedBlockingQueue<>();
    public void Insert(char ch)
    {
        if (map.containsKey(ch)) {
            map.put(ch, map.get(ch) + 1);
            if (order.contains(ch)) order.remove(ch);
        } else {
            map.put(ch, 1);
            order.offer(ch);
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        if (order.isEmpty()) return '#';
        return order.element();
    }

    public void test() {
        Random rand = new Random();
        for (int i = 0; i < 40; i ++) {
            int randNum = rand.nextInt(52);
            char ch = '0';
            if (randNum >= 0 && randNum < 26) {
                ch = (char) ('a' + randNum);
            } else {
                ch = (char) ('A' + randNum - 26);

            }
            Insert(ch);
            System.out.println(ch + " " + FirstAppearingOnce());
        }
    }
}

import java.util.LinkedList;

public class Sim_LastRemaining_Solution {
    public int LastRemaining_Solution(int n, int m) {
        if (n == 0 || m == 0) return -1;
        if (n == 1) return 0;
        if (m == 1) return n - 1;
        LinkedList<Integer> list = new LinkedList();
        for (int i = 0; i < n; i ++) {
            list.add(i);
        }
        int curr = 0;
        for (int i = 0; i < n - 1; i ++) {
            curr = (curr + m - 1) % list.size();
            System.out.println(list.get(curr));
            list.remove(curr);
        }
        return list.get(0);
    }

    public void test() {
        LastRemaining_Solution(8, 5);
    }
}

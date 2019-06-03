import java.util.ArrayList;
import java.util.PriorityQueue;

public class Sort_GetLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (input == null || k > input.length) return result;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k, (a, b) -> {return b.compareTo(a);});
        for (int i = 0; i < input.length; i ++) {
            if (minHeap.size() < k) {
                minHeap.offer(input[i]);
            } else if(minHeap.peek() > input[i]) {
                minHeap.poll();
                minHeap.offer(input[i]);
            }
        }
        for (Integer num : minHeap) {
            result.add(num);
        }
        return result;
    }
}


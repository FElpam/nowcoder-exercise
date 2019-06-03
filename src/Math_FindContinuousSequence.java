import java.util.ArrayList;

public class Math_FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
        for (int i = 2; ; i ++) {
            int avg = sum / i;
            int first = getFirst(avg, i);
//            System.out.println(avg + " " + first + " " + i);
            if (first <= 0) break;
            if (i % 2 == 0) {
                if ((2 * avg + 1) * i / 2 == sum) resultList.add(0, getSequenceByMid(first, i));
            } else {
                if (avg * i == sum) resultList.add(0, getSequenceByMid(first, i));
            }

        }
        return resultList;
    }

    public ArrayList<Integer> getSequenceByMid(int first, int count) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < count; i ++) {
            resultList.add(i + first);
        }
        return resultList;
    }

    public int getFirst(int mid, int count) {
        int first;
        if (count % 2 == 0) {
            first = mid - count / 2 + 1;
        } else {
            first = mid - count / 2;
        }
        return first;
    }

    public void test() {
        ArrayList<ArrayList<Integer>> list = FindContinuousSequence(100);
        for (ArrayList<Integer> subList: list) {
            System.out.println(subList);
        }
    }
}

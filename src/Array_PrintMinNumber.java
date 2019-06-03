import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Array_PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int n: numbers) {
            list.add(n);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1+""+o2).compareTo(o2+""+o1);
            }
        });
        String result = "";
        for (Integer n: list) {
            result += n;
        }
        return result;
    }
}

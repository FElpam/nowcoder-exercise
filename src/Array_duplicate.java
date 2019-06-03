import java.util.HashSet;

public class Array_duplicate  {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        HashSet<Integer> map = new HashSet<>();
        for (int i = 0; i < length; i ++) {
            if (map.contains(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            } else {
                map.add(numbers[i]);
            }
        }
        return false;
    }
}

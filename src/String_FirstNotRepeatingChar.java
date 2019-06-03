import java.util.HashMap;
import java.util.LinkedHashMap;

public class String_FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character, Integer> counter = new LinkedHashMap<>();
        char tempChar;
        for (int i = 0; i < str.length(); i ++) {
            tempChar = str.charAt(i);
            if (!counter.containsKey(tempChar)) {
                counter.put(tempChar, 1);
            } else {
                counter.put(tempChar, counter.get(tempChar) + 1);
            }
        }
        for (int i = 0; i < str.length(); i ++) {
            tempChar = str.charAt(i);
            if (counter.get(tempChar) == 1) return i;
        }
        return -1;
    }

    public void test() {
        String str = "abcbbc";
        System.out.println(FirstNotRepeatingChar(str));
    }
}

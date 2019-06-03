import java.util.ArrayList;
import java.util.Collections;

public class String_Permutation {
    ArrayList<String> resultList = new ArrayList<>();
    public ArrayList<String> Permutation(String str) {
        if (str == null || str.length() == 0) return resultList;
        char[] charArr = str.toCharArray();
        permutate(charArr, 0);
        Collections.sort(resultList);
        return resultList;
    }

    public void permutate(char[] charArr, int curr) {
        if (curr >= charArr.length - 1) {
            String newString = String.valueOf(charArr);
            if (!resultList.contains(newString)) {
                resultList.add(newString);
            }
            return;
        }
        for (int i = curr; i < charArr.length; i ++) {
            if (charArr[i] == charArr[curr] && i != curr) continue;
            swap(charArr, curr, i);
            permutate(charArr , curr + 1 );
            swap(charArr, curr, i);
        }
        return;
    }

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void test() {
        String s = "aba";
        Permutation(s);
        System.out.println(resultList.toString());
    }
}

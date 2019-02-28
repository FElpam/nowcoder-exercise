import java.util.ArrayList;

public class String_Permutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> resultList = new ArrayList<>();
        if (str.length() == 0) {
            resultList.add("");
            return resultList;
        }
        char[] alphabet = new char[52];
        char temp;
        for (int i = 1; i < str.length(); i ++) {
            temp = str.charAt(i);
            if (temp >= 'a' && temp <= 'z') {
                alphabet[temp - 'a'] ++;
            }
            else if (temp >= 'A' && temp <= 'Z') {
                alphabet[temp - 'A' + 26] ++;
            }
        }
        resultList.add(String.valueOf(str.charAt(0)));
        for (int i = 0; i < alphabet.length; i ++) {
            for (int j = 0; j < resultList.size(); j ++) {
                String currString = resultList.get(j);
                for (int k = 0; k < currString.length(); k ++) {
                    if (currString.charAt(k) != getMyChar(i)) {
                        String s1 = currString.substring(0, k - 1);
                        String s2 = currString.substring(k, currString.length() - 1);
                        String newString = s1 + getMyChar(i) +
                    }
                }
                resultList.remove(j);
            }
        }
    }

    public char getMyChar(int index) {
        if (index >=0 && index <= 25) return (char)('a' + index);
        return (char)('A' + index - 26);
    }
}

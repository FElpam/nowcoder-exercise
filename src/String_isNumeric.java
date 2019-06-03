public class String_isNumeric {
    public boolean isNumeric(char[] str) {
        if (str.length == 0) return false;

        {
            char lastChar = str[str.length - 1];
            if (!(lastChar >= '0' && lastChar <= '9')) return false;
        }
        int mid = -1;
        for (int i = 0; i < str.length; i ++) {
            if (str[i] == 'e' || str[i] == 'E') {
                mid = i;
                break;
            }
        }
        if (mid == -1) return isBase(str, 0, str.length - 1);
        boolean base = isBase(str, 0, mid - 1);
        boolean exp = isExp(str, mid + 1, str.length - 1);
        return base && exp;
    }

    public boolean isBase(char[] str, int head, int tail) {
        if (head > tail) return false;
        int index = head;
        if (str[index] == '-' || str[index] == '+') index ++;
        while (index < tail) {
            if (isNum(str[index])) {
                index ++;
            } else break;
        }
        if (str[index] == '.') index ++;
        while (index < tail) {
            if (isNum(str[index])) {
                index ++;
            } else return false;
        }
        return true;
    }

    public boolean isExp(char[] str, int head, int tail) {
        if (head > tail) return false;
        int index = head;
        if (str[index] == '-' || str[index] == '+') index ++;
        while (index < tail) {
            if (isNum(str[index])) {
                index ++;
            } else return false;
        }
        return true;
    }

    public boolean isNum(char ch) {
        if (ch >= '0' && ch <= '9') return true;
        return false;
    }

    public void test() {
        char[] str = "123.45e+6".toCharArray();
        System.out.println(isNumeric(str));
    }
}

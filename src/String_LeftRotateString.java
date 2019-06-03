public class String_LeftRotateString {
    public String LeftRotateString(String str,int n) {
        if (str.length() <= 1) return str;
        int offset = n % str.length();
        if (offset == 0) return str;
        String leftStr = str.substring(0, offset);
        String rightStr = str.substring(offset, str.length());
        String result = rightStr.concat(leftStr);
        return result;
    }

    public void test() {
        String str = "123456";
        System.out.println(LeftRotateString(str, 6));
    }
}

public class String_ReverseSentence {
    public String ReverseSentence(String str) {
        if (str == null || str.length() == 0 || isSpace(str)) return str;
        String[] strings = str.split(" ");
        StringBuilder sb = new StringBuilder(strings[strings.length - 1] );
        for (int i = strings.length - 2; i >= 0; i --) {
            sb.append(" " +  strings[i]);
        }
        return sb.toString();
    }

    public boolean isSpace(String str) {
        for (int i = 0; i < str.length() - 1; i ++) {
            if (str.charAt(i) != ' ') return false;
        }
        return true;
    }

    public void test() {
        String str = " ";
        System.out.println(ReverseSentence(str));
    }
}

public class String_match {
    public boolean match(char[] str, char[] pattern)
    {
        if (str == null || pattern == null) return false;
        if (str.length == 0 && pattern.length == 0) return true;
        if (pattern.length == 0) return false;
        return match(str, pattern, 0, 0);
    }

    public boolean match(char[] str, char[] pattern, int sp, int pp) {
        if (sp >= str.length && pp < pattern.length) {
            if (canNull(pattern, pp)) return true;
        }
        if (sp >= str.length || pp >= pattern.length) return false;
        if ((sp == str.length - 1) && (pp == pattern.length - 1) && (str[sp] == pattern[pp] || pattern[pp] == '.')) return true;
        if (!(pp + 1 < pattern.length && pattern[pp + 1] == '*')) {
            if (pattern[pp] == '.' || str[sp] == pattern[pp]) return match(str, pattern, sp + 1, pp + 1);
            else return false;
        } else {
            if (pattern[pp] == '.' || str[sp] == pattern[pp])
                return match(str, pattern, sp, pp + 2) || match(str, pattern, sp + 1, pp);
            else return match(str, pattern, sp, pp + 2);
        }
    }

    public boolean canNull(char[] pattern, int pp) {
        while (pp < pattern.length) {
            if (pp + 1 < pattern.length && pattern[pp + 1] == '*') pp += 2;
                else return false;
        }
        return true;
    }

    public void test() {
        char[] str = "bbbba".toCharArray();
        char[] pattern = ".*a*a".toCharArray();
        System.out.println(match(str, pattern));
    }
}

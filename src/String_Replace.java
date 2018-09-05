public class String_Replace {
    public String replaceSpace(StringBuffer str) {
        for (int i = str.length() -1; i >= 0; i --){
            if (' ' == str.charAt(i)){
                str.replace(i, i+1, "%20");
            }
        }
        return str.toString();
    }
}

/*
    从后往前可以减少循环次数
 */
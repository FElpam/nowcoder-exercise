import java.util.Arrays;

public class Recursion_UglyNumber {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) return 0;
        if (index == 1) return 2;
        int[] uglyArr = new int[index];
        uglyArr[0] = 2;
        int p2 = 0, p3 = 0, p5 = 0;
        int num2, num3, num5, m;
        for (int i = 1; i < index; i ++) {
            num2 = uglyArr[p2] * 2;
            num3 = uglyArr[p3] * 3;
            num5 = uglyArr[p5] * 5;
            uglyArr[i] = min(num2, num3, num5);
            if (uglyArr[i] == uglyArr[p2] * 2) p2 ++;
            if (uglyArr[i] == uglyArr[p3] * 3) p3 ++;
            if (uglyArr[i] == uglyArr[p5] * 5) p5 ++;
        }
        System.out.println(Arrays.toString(uglyArr));
        return uglyArr[index - 1];
    }

    public int min(int a, int b, int c) {
        return a>b?(b>c?c:b):(a>c?c:a);
    }

    public void test() {
        GetUglyNumber_Solution(10);
    }
}

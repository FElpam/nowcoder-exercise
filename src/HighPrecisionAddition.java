import java.util.Scanner;

public class HighPrecisionAddition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a, b;
        a = in.next();
        b = in.next();
        int[] result = new int[a.length() > b.length() ? a.length() + 1 : b.length() + 1];
        System.out.println(result.length);
        int i, j;
        int resultIndex = result.length - 1;
        int carry = 0;
        for (i = a.length() - 1, j = b.length() - 1; i >= 0 && j >= 0; i--, j--) {
            result[resultIndex] = carry + a.charAt(i) + b.charAt(j) - 2 * '0';
            carry = result[resultIndex] / 10;
            result[resultIndex] %= 10;
            resultIndex --;
        }
        System.out.println("resultIndex = " + resultIndex);
        while (i >= 0) {
            result[resultIndex] = a.charAt(i) - '0' + carry;
            carry = result[resultIndex] / 10;
            result[resultIndex] %= 10;
            resultIndex --;
            i --;
        }
        while (j >= 0) {
            result[resultIndex] = b.charAt(j) - '0' + carry;
            carry = result[resultIndex] / 10;
            result[resultIndex] %= 10;
            resultIndex --;
            j --;
        }
        System.out.println("resultIndex = " + resultIndex);
        result[resultIndex] = carry;
        for (i = 0; i < result.length; i ++) {
            System.out.print(result[i]);
        }
        return;
    }
}

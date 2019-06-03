import java.util.Scanner;

public class HighPrecisionMultiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        int i, j;
        int[] arrA = getArrayByString(a);
        int[] arrB = getArrayByString(b);
        int[] result = new int[a.length() + b.length()];
        for (i = arrA.length - 1; i >= 0; i --) {
            for (j = arrB.length - 1; j >=0; j --){
                result[i + j + 1] += arrA[i] * arrB[j];
            }
        }
        int carry = 0;
        for (i = result.length - 1; i >= 0; i --) {
            result[i] += carry;
            carry = result[i] / 10;
            result[i] %= 10;
        }
        if (result[0] == 0) i = 1; else i = 0;
        for (; i < result.length; i ++) {
            System.out.print(result[i]);
        }
    }

    public static int[] getArrayByString(String s) {
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i ++) {
            arr[i] = s.charAt(i) - '0';
        }
        return arr;
    }
}

import java.util.Arrays;

public class Array_multiply {
    public int[] multiply(int[] A) {
        if (A.length == 0 || A.length == 1) return A;

        int[] B = new int[A.length];
        int[] left = new int[A.length + 1];
        int[] right = new int[A.length + 1];
        left[0] = 1;
        right[A.length] = 1;
        for (int i = 1; i <= A.length; i ++) {
            left[i] = A[i - 1] * left[i - 1];
        }
        for (int i = A.length - 1; i >= 0; i --) {
            right[i] = A[i] * right[i + 1];
        }
        for (int i = 0; i < A.length; i ++) {
            B[i] = left[i] * right[i + 1];
        }

        return B;
    }

    public void test() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(multiply(arr)));
    }
}

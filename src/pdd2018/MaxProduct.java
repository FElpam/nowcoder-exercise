package pdd2018;

import java.util.*;
public class MaxProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i, j;
        long[] arr = new long[n];
        for (i = 0; i < n; i ++) {
            arr[i] = in.nextInt();
        }
        // border
        if (n <= 2) return;
        // max
        for (i = n - 1; i >= n - 3; i --) {
            for (j = 0; j < i; j ++) {
                if (arr[i] < arr[j]) {
                    swap(arr,i,j);
                }
            }
        }
        // min
        for (i = 0; i < 2; i ++) {
            for (j = i + 1; j <= n - 4; j ++) {
                if (arr[i] > arr[j]) {
                    swap(arr,i,j);
                }
            }
        }

        // result

        System.out.println(Math.max(arr[n - 1] * arr[n - 2] * arr[n - 3], arr[0] * arr[1] * arr[n - 1]));
    }

    public static void swap(long[] arr, int i, int j) {
        long temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
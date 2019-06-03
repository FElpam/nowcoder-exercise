public class DP_GreatestSubsequence {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) return 0;
        int[] sum = new int[array.length];
        sum[0] = array[0];
        int i;
        for (i = 1; i < array.length; i ++) {
            sum[i] = Math.max(sum[i - 1] + array[i], array[i]);
        }
        int max = sum[0];
        for (i = 1; i < array.length; i ++) {
            if (max < sum[i]) {
                max = sum[i];
            }
        }
        return max;
    }

    public void test() {
        int[] arr = {6,-3,-2,7,-15,1,2,2};
        System.out.println(FindGreatestSumOfSubArray(arr));
    }
}

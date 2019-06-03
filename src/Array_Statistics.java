public class Array_Statistics {
    public int GetNumberOfK(int [] array , int k) {
        return find(array, k + 0.5) - find(array, k - 0.5);
    }
    public int find(int[] array, double n) {
        int left = 0;
        int right = array.length - 1;
        if (array[left] > n) return 0;
        if (array[right] < n) return array.length;
        int mid = (left + right) / 2;
        while (left < right - 1) {
            if (array[mid] > n) {
                right = mid;
            } else {
                left = mid;
            }
            mid = (left + right) / 2;
        }
        return left + 1;
    }

    public void test() {
        int[] arr = {1,2,3,3,3,3,4,5};
        System.out.println(find(arr,4.5));
    }
}

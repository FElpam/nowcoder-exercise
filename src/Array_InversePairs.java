import java.util.Arrays;

public class Array_InversePairs {
    int[] tempArr;
    public int InversePairs(int [] array) {
        if (array == null || array.length == 0) return 0;
        tempArr = new int[array.length];
        return MergeCount(array, 0 ,array.length - 1);
    }

    public int MergeCount(int[] arr, int start, int end) {
        if (start >= end) return 0;
        int mid = (start + end) >> 1;
        int leftCount = MergeCount(arr, start, mid) % 1000000007;
        int rightCount = MergeCount(arr, mid + 1, end) % 1000000007;
        int pLeft = mid;
        int pRight = end;
        int count = 0;
        int tempIndex = end;
        while (pLeft >= start && pRight > mid) {
            if (arr[pLeft] > arr[pRight]) {
                count += pRight - mid;
                tempArr[tempIndex --] = arr[pLeft --];
                if(count>=1000000007)//数值过大求余
                {
                    count%=1000000007;
                }
            }
            else {
                tempArr[tempIndex --] = arr[pRight --];
            }
        }
        while (pLeft >= start) {
            tempArr[tempIndex --] = arr[pLeft --];
        }
        while (pRight > mid) {
            tempArr[tempIndex --] = arr[pRight --];
        }
        for (int i = start; i <= end; i ++) {
            arr[i] = tempArr[i];
        }
        return (leftCount + rightCount + count) % 1000000007;
    }

    public void test() {
        int[] arr = {4,3,2,1,2,3,4};
        System.out.println(InversePairs(arr));
        System.out.println(Arrays.toString(arr));
    }
}

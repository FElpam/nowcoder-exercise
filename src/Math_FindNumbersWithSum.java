import java.util.ArrayList;

public class Math_FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int left = 0;
        int right = array.length - 1;
        int leftNum = 0;
        int rightNum = 0;
        int lastProduct = Integer.MAX_VALUE;
        while (left < right) {
            int tempSum = array[left] + array[right];
            if (tempSum == sum) {
                if (lastProduct > array[left] * array[right]) {
                    leftNum = array[left];
                    rightNum = array[right];
                    lastProduct = array[left] * array[right];
                }
                left ++;
            } else if (tempSum < sum) {
                left ++;
            } else if (tempSum > sum) {
                right --;
            }
        }
        if (leftNum == 0 && rightNum == 0) return resultList;
        resultList.add(leftNum);
        resultList.add(rightNum);
        return resultList;
    }

    public void test() {

    }
}

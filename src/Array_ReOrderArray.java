import java.util.Arrays;

public class Array_ReOrderArray {
    public void reOrderArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 2; j >= 0; j--) {
                if (!isOdd(array[j]) && isOdd(array[j + 1])) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public boolean isOdd(int num) {
        if (num % 2 == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int[] intArr = TestCase.newIntArray(10);
            System.out.println(Arrays.toString(intArr));
            new Array_ReOrderArray().reOrderArray(intArr);
            System.out.println(Arrays.toString(intArr));
            System.out.println();
        }
    }
}

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Math_isContinuous {
    public boolean isContinuous(int [] numbers) {
        if (numbers.length < 5) return false;
        int zeros = 0;
        int max = 0;
        int min = 0;
        int[] hashArr = new int[15];
        for (int i = 0; i < numbers.length; i ++) {
            if (numbers[i] == 0) {
                zeros ++;
                continue;
            } else {
                if (hashArr[numbers[i]] > 0) return false;
                else {
                    hashArr[numbers[i]] ++;
                }
            }
        }
        for (int i = 1; i <= 13; i ++) {
            if (hashArr[i] > 0) {
                min = i;
                break;
            }
        }
        for (int i = 13; i >= 1; i --) {
            if (hashArr[i] > 0) {
                max = i;
                break;
            }
        }
        if (max - min <= 4) return true;
        return false;
    }

    public int max(int[] numbers) {
        if (numbers.length == 0) return 0;
        if (numbers.length == 1) return numbers[0];
        int maxNum = numbers[0];
        for (int i = 1; i < numbers.length; i ++) {
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
        }
        return maxNum;
    }

    public int min(int[] numbers) {
        if (numbers.length == 0) return 0;
        if (numbers.length == 1) return numbers[0];
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i ++) {
            if (numbers[i] < minNum && numbers[i] != 0) {
                minNum = numbers[i];
            }
        }
        if (minNum == Integer.MAX_VALUE) return 0;
        return minNum;
    }



    public void test() {
        int[] numbers = new int[5];
        Random rand = new Random();
        for (int j = 0; j < 100; j ++) {
            for (int i = 0; i < 5; i++) {
                numbers[i] = rand.nextInt(14);
            }
            System.out.println(Arrays.toString(numbers) + " " + isContinuous(numbers));
        }
    }
}

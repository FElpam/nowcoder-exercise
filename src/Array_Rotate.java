import java.util.Arrays;
import java.util.Random;

public class Array_Rotate {
    public int minNumberInRotateArray(int [] array) {
        int head = 0;
        int tail = array.length - 1;
        if (array.length == 0) return 0;
        if (array[head] < array[tail]) return array[head];
        else if (array[head] == array[tail]) {
            int min = array[0];
            for (int i = 1; i < array.length; i ++){
                if (array[i] < min) min = array[i];
            }
            return min;
        }

        int mid;
        while (head + 1 < tail) {
            if (array[head] > array[tail]) {
                mid = (head + tail) / 2;
                // bug：用了<而不是<=
                if (array[head] <= array[mid]) head = mid;
                else tail = mid;
            }
        }
        return array[tail];
    }

    public int minNum(int[] array){
        if (array.length == 0) return 0;
        int min = array[0];
        for (int i = 1; i < array.length; i ++){
            if (min > array[i]) min = array[i];
        }
        return min;
    }
    public void generateTestData(){
        Random ran = new Random();
        int len = 10;
        int arr[] = new int[len];
        int testArr[] = new int[len];
        for (int i = 0; i < len; i ++){
            arr[i] = ran.nextInt(10);
        }
        Arrays.sort(arr);
        int offset = ran.nextInt(len);
        System.out.println("offset = " + offset);
        for (int i = 0; i < len; i ++){
            testArr[(i + offset) % len] = arr[i];
        }

        for (int i = 0; i < len; i ++){
            System.out.format("%d ", testArr[i]);
        }
        System.out.println();

        int a = minNumberInRotateArray(testArr);
        int b = minNum(testArr);
        if (a == b) System.out.println("√");
        else System.out.print(a + " " + b);
    }

    public void test(){
        for (int i = 0; i < 10; i ++){
            System.out.println("test begin -- " + i);
            generateTestData();
        }
    }

}

/*
* bug1：数组越界，tail应该为array.length - 1而不是array.length
*
*
*/


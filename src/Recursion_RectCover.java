/*
    我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
    请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，
    总共有多少种方法？

    思路：斐波那契
 */

public class Recursion_RectCover {
    public int RectCover(int target) {
        if (target <= 0) return 0;
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= target; i++) {
            arr[i % 3] = arr[(i - 1) % 3] + arr[(i - 2) % 3];
        }
        return arr[target % 3];
    }

    public static void main(String[] args){
        System.out.println(new Recursion_RectCover().RectCover(3));
    }
}

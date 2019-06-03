public class Array_MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array.length <= 0 || array == null) return 0;
        int currNum = array[0];
        int count = 1;
        for (int i = 1; i < array.length; i ++) {
            if (array[i] == currNum) count ++;
            else if (count <= 0) {
                currNum = array[i];
                count = 1;
            }
            else count --;
        }
        count = 0;
        for (int i = 0; i < array.length; i ++) {
            if (array[i] == currNum) count ++;
        }
        if (count > (array.length / 2)) {
            return currNum;
        }
        return 0;
    }

    public void test() {
        int[] arr = {1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(arr));
    }
}

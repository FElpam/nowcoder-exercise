public class Array {
    public boolean Find(int target, int [][] array) {
        int i = 0;
        int j = array[i].length - 1;
        while (i < array.length && j >= 0) {
            if (array[i][j] == target)
                return true;
            else if (target > array[i][j])
                i ++;
            else j --;
        }
        return false;
    }
}

/*
    思路：从右上或者左下开始搜索，递增方向和递减方向分别对应横轴和纵轴。
        这样，移动的方向就是确定的。而从左上或者右下开始则会不确定，
        比如从左上开始，无论横向移动或者纵向移动，都是使当前查找的数增大。

    错误1：j>=0 写成了 j>0
    错误2：i++和j--的顺序颠倒了

 */
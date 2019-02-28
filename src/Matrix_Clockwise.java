import java.util.ArrayList;

public class Matrix_Clockwise {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        return printRectangle(matrix, 0, matrix.length - 1, 0, matrix[0].length - 1);
    }
    public ArrayList<Integer> printRectangle(int [][] matrix, int up, int down, int left, int right) {
//        System.out.println(up + " " + down + " " + left + " " + right);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i ++){
            list.add(matrix[up][i]);
        }
        for (int i = up + 1; i <= down; i ++) {
            list.add(matrix[i][right]);
        }
        for (int i = right - 1; i >= left; i --) {
            list.add(matrix[down][i]);
        }
        for (int i = down - 1; i >= up + 1; i --) {
            list.add(matrix[i][left]);
        }
        if (down - up > 1 && right - left > 1) {
            list.addAll(printRectangle(matrix, up + 1, down - 1, left + 1, right - 1));
        }
        if (down - up == 0) {
            for (int i = 0; i < right - left ; i ++){
                list.remove(list.size() - 1 );
            }
        }
        if (right - left == 0) {
            for (int i = 0; i < down - up - 1; i ++){
                list.remove(list.size() - 1);
            }
        }
        return list;
    }

    public void test() {
        int [][] mat = {{1, 2, 3, 4}, {5,6,7,8}, {9,10,11,12},{13,14,15,16}};
        int [][] mat1 = {{1},{2},{3},{4},{5}};
        int [][] mat2 = {{1,2}, {3,4},{5,6},{7,8},{9,10}};
        System.out.println(printMatrix(mat2));
    }
}

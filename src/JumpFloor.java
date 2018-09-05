public class JumpFloor {
    public int JumpFloor(int target) {
        int i;
        if (0 == target) return 0;
        else if (1 == target) return 1;
        else {
            int[] arr = new int[3];
            arr[0] = 1;
            arr[1] = 1;
            for (i = 2; i <= target; i++) {
                arr[i % 3] = arr[(i - 1) % 3] + arr[(i - 2) % 3];
            }
            return arr[(i - 1) %3];
        }
    }
}

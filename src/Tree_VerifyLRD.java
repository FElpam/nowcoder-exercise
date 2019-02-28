public class Tree_VerifyLRD {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0) return false;
        return isLRD(sequence, 0, sequence.length - 1);
    }

    public boolean isLRD(int[] sequence, int head, int tail) {
        if (head >= tail) return true;
        int rightRoot = head;
        int root = sequence[tail];
        for (; rightRoot <= tail - 1; rightRoot ++) {
            if (sequence[rightRoot] > root) break;
        }
        for (int i = rightRoot + 1; i < tail; i ++) {
            if (sequence[i] < root) return false;
        }
        return isLRD(sequence, head, rightRoot - 1)
                && isLRD(sequence, rightRoot, tail - 1);
    }

    public void test() {
        int[] seq = {2, 1, 3};
        System.out.println(VerifySquenceOfBST(seq));
    }
}

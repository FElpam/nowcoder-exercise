public class JumpFloorII {
    public int JumpFloorII(int target) {
        return 1 << --target;
    }
}
// 相当于计算2^(n-1)
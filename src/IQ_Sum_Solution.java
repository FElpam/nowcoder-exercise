public class IQ_Sum_Solution {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean bool = (n > 0) && ((sum += Sum_Solution(n - 1)) > 0);
        return sum;
    }

    public void test() {
        System.out.println(Sum_Solution(5));
    }
}

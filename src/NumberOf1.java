public class NumberOf1 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        int i = 1;
        int high, low, current;
        while (n / i != 0) {
            high = (n / i) / 10;
            low = n % i;
            current = (n / i) % 10;
            if (current < 1) {
                count += high * i;
            } else if (current == 1) {
                count += high * i + low + 1;
            } else {
                count += (high + 1) * i;
            }
            i *= 10;
        }
        return count;
    }

    public void test() {
        System.out.println(NumberOf1Between1AndN_Solution(13));
    }
}

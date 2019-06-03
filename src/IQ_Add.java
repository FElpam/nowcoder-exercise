public class IQ_Add {
    public int Add(int num1,int num2) {
        int temp;
        while (num2 != 0) {
            temp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }
        return num1;
    }

    public void test() {
        System.out.println(Add(175, 57));
    }
}

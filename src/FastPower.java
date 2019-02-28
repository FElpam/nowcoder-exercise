public class FastPower {
    public double Power(double base, int exponent) {
        double tempBase = base;
        int n;
        double result = 1;
        if (exponent > 0){
            n = exponent;
        }
        else if (exponent < 0){
            if (base == 0) throw new RuntimeException("0不能负幂");
            n = -exponent;
        }
        else return 1;
        while (n != 0){
            if ((n&1) == 1){
                result *= tempBase;
            }
            tempBase *= tempBase;
            n >>= 1;
        }
        return exponent>=0?result:1/result;
    }
}

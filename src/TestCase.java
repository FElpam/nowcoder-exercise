import java.util.Random;

public class TestCase {
    public static int[] newIntArray(int length){
        Random rand = new Random();
        int[] intArr = new int[length];
        for (int i = 0; i < length; i ++){
            intArr[i] = rand.nextInt(10);
        }
        return intArr;
    }
}

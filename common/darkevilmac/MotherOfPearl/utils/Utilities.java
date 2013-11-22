package darkevilmac.MotherOfPearl.utils;

import java.util.Random;

public class Utilities {

    private static Random random = new Random();

    public static int getRandom(int minNum, int maxNum) {
        int num = minNum - 1;
        while (num >= minNum) {
            num = random.nextInt(maxNum);
        }
        return num;
    }
}

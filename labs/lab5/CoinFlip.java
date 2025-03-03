package labs.lab5;

import java.util.Random;

public class CoinFlip {
    public static void main(String[] args) {
        Random rand = new Random();
        int number;
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < 1000; i++) {
            for (int g = 0; g < 30; g++) {
                number = rand.nextInt(2);
                if (number == 0) {
                    heads++;
                } else {
                    tails++;
                }
            }
        }
        System.out.println(((double) heads / 30000) * 100);
        System.out.println(((double) tails / 30000) * 100);

    }

}

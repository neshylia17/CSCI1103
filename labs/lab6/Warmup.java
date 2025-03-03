package labs.lab6;

import java.util.Random;

public class Warmup {
    public static void main(String[] args) {
        Random rand = new Random();
        int Random = 15;
        int String = 16;
        int i;
        

        for (i = 0; i < Random; i++){
            String randomString = "";
        for (int j = 0; j < String; j++) {
            char c = (char) rand.nextInt(65, 91);
            randomString += c;
        }
            
        System.out.println(randomString);
        }
    

    }
}

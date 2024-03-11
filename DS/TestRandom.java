package DS;

import java.io.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TestRandom {
    public static void main(String[] args) {
        double random1 = 10 + (Math.random() * 40);
        System.out.println(random1);

         Random rand = new Random();
         int random2 = 10+rand.nextInt(40);
         System.out.println(random2);

         int random3 = 10+ThreadLocalRandom.current().nextInt(40);
         System.out.println(random3);

         String str  = "Java";
         str.concat("programming");
         System.out.println(str);
    }

}

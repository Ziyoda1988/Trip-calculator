package Practice;

import Practice.Salom;

public class Lamboda  {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
       Salom salom = (int x, int y ) -> a + b;
        System.out.println(salom.add(a, b));

        }

    }



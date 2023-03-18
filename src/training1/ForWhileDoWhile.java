package training1;

public class ForWhileDoWhile {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }
        for (int i = 100; i >= 10; i--) {
            System.out.println(i);

        }
        System.out.println("----------------");

        int j = 0;
        while (j < 20) {
            j++;
            System.out.println(j);


        }
        System.out.println("----------------------");
        boolean isTrue = true;
        int k = 0;
        while (isTrue) {
            System.out.println(k);
            k += 2;
            if (k > 10) ;
            isTrue = false;

        }
        System.out.println("-----------");
        int x = 13;
        do {
            x--;
            System.out.println(x);
        } while (x > 10);


    }

}

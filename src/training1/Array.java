package training1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] name = new int[]{23, 84, 45, 33};
        System.out.println(name[2]);


        float[] num = new float[]{4.23f, 12.5f, 7};
        System.out.println(num[0]);

        System.out.println("-----------------");
        int[] a;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers of array:");
        n = in.nextInt();
        a = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + i +"] =");
            a[i] = in.nextInt();


        }
    }
}

package training2;

import java.util.Scanner;

public class ScannerInt {
    public static void main(String[] args) {
        System.out.println("գրեք ցանկացած թիվ 1 ից 10: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("դուք ընտրել եք " + number);


        Scanner k = new Scanner(System.in);
        System.out.println("գրեք 2 ցանկացաց լռիվ թիվ: ");
        int number1 = k.nextInt();
        int number2 = k.nextInt();
        System.out.println(number1 + number2);


        Scanner sc = new Scanner(System.in);
        System.out.println("գրեք ցանկացած բառ: ");
        String phrase1 = sc.nextLine();
        System.out.println(phrase1);

        Scanner sca = new Scanner(System.in);
        System.out.println("գրեք ցանկացած 2 բառ: ");
        String phrase3 = sca.nextLine();
        String phrase4 = sca.nextLine();
        System.out.println(phrase3 + " " + phrase4);


        Scanner s = new Scanner(System.in);
        System.out.println("գրեք ցանկացած բառ: ");
        String phrase5 = s.next();
        System.out.println(phrase5);


        System.out.println("գրեք ցանկացած կոտորակային թիվ: ");
        Scanner S = new Scanner(System.in);
        double number6 = S.nextDouble();
        System.out.println("դուք ներմուծել եք " + number);
    }

}

package training1;
import java.util.Scanner;
public class Scanner1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first,second,result;
        System.out.print("Enter first num: ");
        first = num.nextInt();
        System.out.print("Enter second num: ");
        second = num.nextInt();
        result = first + second;
        System.out.print("Result is -" + result);
    }

    }





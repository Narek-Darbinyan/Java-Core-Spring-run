package homework10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class CollectionExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        HashSet<String> uniqueNmes = new HashSet<String>();


        names.add("Jora");
        names.add("Nraek");
        names.add("Sevak");
        names.add("Erik");
        names.add("Karen");
        names.add("Aram");
        names.add("Gugo");
        names.add("Xcho");
        names.add("Artur");
        names.add("Davo");

        Collections.sort(names);
        System.out.println("Sorted list of names:");
        System.out.println(names);

        System.out.println("Enter 5 name:");

        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            names.add(name);

        }
        System.out.println("List of names  with duplicates:");
        System.out.println(names);

        System.out.println("list of names with duplicates: ");
        System.out.println(uniqueNmes);


        names.add("Jora");
        names.add("Nraek");
        names.add("Sevak");
        names.add("Erik");
        names.add("Karen");
        names.add("Aram");
        names.add("Gugo");
        names.add("Xcho");
        names.add("Artur");
        names.add("Davo");

        Collections.sort(names);
        System.out.println("Sorted list of names:");
        System.out.println(names);
    }
}

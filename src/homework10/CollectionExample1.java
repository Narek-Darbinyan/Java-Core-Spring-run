package homework10;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExample1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Narek");
        names.add("Jora");
        names.add("Sevak");
        names.add("Erik");
        names.add("Davit");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  a name to search for: ");
        String nameToSearch = scanner.nextLine();

        if (names.contains(nameToSearch)) {
            System.out.println("The name\"" + nameToSearch + "\" was found in the list.");
        } else {
            System.out.println("The name\"" + nameToSearch + "\" was not found in the list.");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name to remove: ");
        String nameToRemove = sc.nextLine();

        if (names.contains(nameToRemove)) {
            names.remove(nameToRemove);
            System.out.println("The name\"" + nameToRemove + "\" was removed from the list.");
            System.out.println("The update list of names is: " + names);
        } else {
            System.out.println("the name\"" + nameToRemove + "\" was not found in the list.")
            ;
        }

        Scanner S = new Scanner(System.in);
        System.out.println("Enter a name to insert: ");
        String nameToInsert = S.nextLine();
        System.out.println("Enter an index to insert the name at: ");
        int indexToInsert = S.nextInt();

        names.add(indexToInsert, nameToInsert);
        System.out.println("the name \"" + nameToInsert + "\" was inserted at index" + indexToInsert );
        System.out.println("the updated list of names is: " + names);



    }
}

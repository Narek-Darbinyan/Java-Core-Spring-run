package chapter4;

public class StoragDemo {
    public static void main(String[] args) {
        Storage storage = new Storage();

        Student student = new Student("poxos", "poxosyan", 33);

        Book book = new Book("girq 1", "description", 45);
        storage.add("petros");
        storage.add(6);
        storage.add(book);
        storage.add(student);
        
        Object byIndex = storage.getByIndex(0);
        Student st =(Student) byIndex;
        System.out.println(st.getName());

    }
}

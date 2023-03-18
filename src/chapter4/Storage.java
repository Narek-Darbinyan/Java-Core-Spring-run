package chapter4;

public class Storage {

    Object[] objects = new Object[10];
    int size;

    public void add(Object obj) {
        objects[size++] = obj;

    }


    public Object getByIndex(int index) {
        return objects[index];
    }
}

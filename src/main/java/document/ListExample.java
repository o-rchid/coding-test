package document;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        // get
        list.get(2);

        // remove
        list.remove("three");
        list.remove(2);

        // contains
        list.contains("one");

        // size
        list.size();
    }
}

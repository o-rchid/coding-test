package document;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        // get: 없으면 null
        System.out.println(map.get(1));
        System.out.println(map.get(5));

        // containsKey, containsValue
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("one"));

        // remove
        map.remove(1);
    }
}

package document;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");

        HashSet<String> compareSet = new HashSet<>();
        compareSet.add("one");

        // containsAll
        System.out.println(set.containsAll(compareSet));

        // addAll (합집합)
        set.addAll(compareSet);
        // removeAll (차집합)
        set.removeAll(compareSet);
        // retainAll (교집합)
        set.retainAll(compareSet);
    }
}

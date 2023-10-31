package document;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("a", "b", "c"));
        List<String> compareList = new ArrayList<>(List.of("b", "c"));

        // Collection 하위 인터페이스에는 List, Map, Set 등 존재
        // 아래 메소드는 하위 인터페이스에서도 사용이 가능하다.
        list.size();
        list.equals(compareList);
        list.isEmpty();
        list.contains("");
        list.clear();
        list.remove("a");
        list.removeIf(s -> s == "a");
        list.addAll(compareList);
        list.containsAll(compareList);
        list.removeAll(compareList);
        list.retainAll(compareList);

    }
}

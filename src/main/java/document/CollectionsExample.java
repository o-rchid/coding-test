package document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsExample {
    public static void main(String[] args) {
        Integer[] arr = {5, 26, 1, 74, 59, 38};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        // sort
        Collections.sort(list);

        // max, min
        Collections.max(list);
        Collections.min(list);
    }
}

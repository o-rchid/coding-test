package document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsExample {
    public static void main(String[] args) {
        Integer[] arr = {5, 26, 1, 74, 59, 38};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        Collections.sort(list);

        for (int i : list) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}

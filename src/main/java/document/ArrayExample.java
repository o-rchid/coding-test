package document;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        sort();
        asList();
    }

    /**
     * sort: 오름차순 정렬
     */
    private static void sort() {
        int[] arr = {5, 26, 1, 74, 59, 38};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * asList: 배열을 ArrayList로 변환
     */
    private static void asList() {
        Integer[] arr = {5, 26, 1, 74, 59, 38};
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));

        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}

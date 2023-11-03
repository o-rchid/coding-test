package document;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        int[] arr = {33, 4, 13, 56, 67, 83, 1, 12};
        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int idxMin, tmp;

        for (int i = 0; i < arr.length - 1; i++) {
            idxMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[idxMin])
                    idxMin = j;
            }
            tmp = arr[idxMin];
            arr[idxMin] = arr[i];
            arr[i] = tmp;
        }
    }
}

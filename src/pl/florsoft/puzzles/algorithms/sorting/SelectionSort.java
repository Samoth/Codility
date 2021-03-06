package pl.florsoft.puzzles.algorithms.sorting;

/**
 * Selection sort algorithm.
 * Time complexity: O(n*n).
 * Memory complexity: O(1).
 */
public class SelectionSort {

    /**
     * Sort array of ints using selection sort algorithm.
     */
    public static void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        for (int i = 0; i < array.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int tmp = array[i];
                array[i] = array[minIdx];
                array[minIdx] = tmp;
            }
        }
    }

    /**
     * Sort array of longs using selection sort algorithm.
     */
    public static void sort(long[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        for (int i = 0; i < array.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                long tmp = array[i];
                array[i] = array[minIdx];
                array[minIdx] = tmp;
            }
        }
    }

}

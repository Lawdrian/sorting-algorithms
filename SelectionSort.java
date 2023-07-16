public class SelectionSort {

    public static int[] selectionSort(int[] unsorted) {
        int minValue;
        int minValueIndex;
        int hValue;

        // 1. iterate through whole array
        for (int i = 0; i < unsorted.length; i++) {
            minValue = unsorted[i];
            minValueIndex = i;
            // 2. from each unsorted starting point find the smallest value
            for (int j = i + 1; j < unsorted.length; j++) {
                if (unsorted[j] < minValue) {
                    minValue = unsorted[j];
                    minValueIndex = j;
                }
            }
            // 3. change the smallest value with the currently unsorted value
            hValue = unsorted[i];
            unsorted[i] = minValue;
            unsorted[minValueIndex] = hValue;
        }
        return unsorted;

    }
}
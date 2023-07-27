public class SelectionSort {

    public static int[] selectionSort(int[] arr) {
        int minValue;
        int minValueIndex;
        int hValue;

        // 1. iterate through whole array
        for (int i = 0; i < arr.length; i++) {
            minValue = arr[i];
            minValueIndex = i;
            // 2. from each arr starting point find the smallest value
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minValueIndex = j;
                }
            }
            // 3. change the smallest value with the currently arr value
            hValue = arr[i];
            arr[i] = minValue;
            arr[minValueIndex] = hValue;
        }
        return arr;

    }
}
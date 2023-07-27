public class QuickSort {

    public static int[] initialize(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    public static void quickSort(int[] arr, int low, int high) {
        System.out.println("Quicksort called: low: " + low + " high: " + high);
        if (low < high) {
            int pivot = divide(arr, low, high);

            quickSort(arr, 0, pivot);
            quickSort(arr, pivot + 1, high);
        }

    }

    public static int divide(int[] arr, int low, int high) {
        int pivot = arr[high];
        int temp;

        int i = low;
        int j = high - 1;

        // continue as long as the left pointer (i) is lower than the right pointer (j)
        while (i < j) {
            // find an element >= than the pivot element
            while (arr[i] < pivot) {
                i++;
            }
            // then find an element < than the pivot element
            while (arr[j] >= pivot && i < j) {
                j--;
            }

            System.out.println("low: " + low + " high: " + high);
            Main.printArray(arr);
            // switch the elements
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            Main.printArray(arr);
        }

        // switch the pivot element with the element at position i
        if (arr[i] >= arr[high]) {
            temp = arr[i];
            arr[i] = arr[high];
            arr[high] = temp;
            System.out.print("Pivot switch:");
            Main.printArray(arr);
        } else {
            System.out.println("No pivot switch:");
            Main.printArray(arr);
        }
        return i;
    }
}

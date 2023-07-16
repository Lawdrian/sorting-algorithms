import java.util.Random;

public class Main {

    // helping method to create an array with random numbers
    public static int[] createRandom(int n) {
        Random rd = new Random();
        int[] array = new int[n];
        int min = 0;
        int max = 10;

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(max-min+1) + min;
        }
        return array;
    }


    public static void main(String[] args) {

        int[] unsortedArray = createRandom(5);

        // print out unsorted array
        System.out.print("unsorted array: ");
        for (int i = 0; i <= unsortedArray.length - 1; i++) {
            System.out.print(unsortedArray[i] + ", ");
        }
        System.out.println();

        // use a sorting-algorithm to sort the array. low -> high number
        int[] sortedArray = SelectionSort.selectionSort(unsortedArray);
        //int[] sortedArray = CountingSort.countingSort(unsortedArray);

        // print out sorted array
        System.out.print("sorted array: ");
        for (int i = 0; i <= sortedArray.length - 1; i++) {
            System.out.print(sortedArray[i] + ", ");
        }
        System.out.println();
    }
}

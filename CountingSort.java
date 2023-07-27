public class CountingSort {

    public static int[] countingSort(int[] arr) {

        int aLength = arr.length;

        // 1. find highest value
        int maxValue = arr[0];
        for (int i = 1; i <= aLength - 1; i++) {
            if (arr[i] > maxValue) maxValue = arr[i];
        }

        // 2. create counting array; + 1 because array starts at index 0
        int[] c = new int[maxValue + 1];

        // 3. for every number in the unsorted array, increase the value in the c array at that index for 1
        for (int i = 0; i <= aLength - 1; i++) {
            c[arr[i]]++;
        }

        // 4. summ up the values in the c array
        // index 0,1,2 -> 0,1,2
        // value 1,2,1 -> 1,3,4
        for (int i = 1; i <= c.length - 1; i++) {
            c[i] = c[i] + c[i - 1];
        }

        // print out c array
        System.out.print("c array: ");
        for (int i = 0; i <= c.length - 1; i++) {
            System.out.print(c[i] + ", ");
        }
        System.out.println();


        // 5. create the sorted array
        int[] sorted = new int[aLength];

        // 6. add the numbers in rising order into the sorted array
        for (int i = aLength - 1; i >= 0; i--) {
            System.out.println("index: " + i + ", position: " + c[arr[i]] + ", value: " + arr[i]);

            // -1 neccessary, because array index starts at 0
            sorted[c[arr[i]] - 1] = arr[i];
            // reduce value by one, so that if the same value appears again, it will be put infront
            c[arr[i]]--;
        }

        return sorted;
    }
}


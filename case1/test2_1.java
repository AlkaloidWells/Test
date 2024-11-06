public class test2_1 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 5, 7, 0, 0, 5};
        int lth = arr.length;
        
        for (int i = 0; i < lth; i++) {
            if (arr[i] == 0) {
                // Find the next non-zero element
                for (int j = i + 1; j < lth; j++) {
                    if (arr[j] != 0) {
                        // Swap non-zero element with the zero at index `i`
                        arr[i] = arr[j];
                        arr[j] = 0;
                        break;  // Move to the next `i` position after swapping
                    }
                }
            }
        }
        
        System.out.println("Array after moving zeroes: " + java.util.Arrays.toString(arr));
    }
}

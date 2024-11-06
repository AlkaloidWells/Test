public class test3_1 {
    public static void main(String[] args) {
        int[] array = {10, 0}; // You can test with different arrays here
        int x = centeredArray(array);
        System.out.println("Is Centered: " + x);
    }

    public static int centeredArray(int[] arr) {
        int lth = arr.length;
        
        // Check if the array has an odd length and is not empty
        if (lth == 0 || lth % 2 == 0) {
            return 0; // Not centered
        }

        int middleIndex = lth / 2;
        int middleValue = arr[middleIndex];

        // Check if all other elements are greater than the middle element
        for (int i = 0; i < lth; i++) {
            if (i != middleIndex && arr[i] <= middleValue) {
                return 0; // Found an element that is not greater than the middle element
            }
        }
        
        return 1; // All conditions met, the array is centered
    }
}

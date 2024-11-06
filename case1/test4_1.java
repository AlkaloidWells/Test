public class test4_1 {
    public static void main(String[] args) {
        int[] arr = {1, 1}; // You can test with different arrays here
        int result = calculateDifference(arr);
        System.out.println("Difference: " + result);
    }

    public static int calculateDifference(int[] arr) {
        if (arr.length == 0) {
            return 0; // If the array is empty, return 0
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        return oddSum - evenSum;
    }
}

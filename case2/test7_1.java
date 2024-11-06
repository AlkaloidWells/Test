public class test7_1 {
    public static void main(String[] args) {
        int[] first = {1, 3, 6, 6, 4};
        int[] second = {4, 5, 6};

        int[] commonElements = findCommonElements(first, second);

        if (commonElements == null) {
            System.out.println("null");
        } else {
            System.out.println("Common elements: " + java.util.Arrays.toString(commonElements));
        }
    }

    public static int[] findCommonElements(int[] first, int[] second) {
        // Check for null inputs
        if (first == null || second == null) {
            return null;
        }

        int lth1 = first.length;
        int lth2 = second.length;

        // If any array is empty, return an empty array
        if (lth1 == 0 || lth2 == 0) {
            return new int[0];
        }

        // Temporary result array with the minimum length of two arrays
        int[] tempResult = new int[Math.min(lth1, lth2)];
        int count = 0;

        // Find common elements
        for (int i = 0; i < lth1; i++) {
            for (int j = 0; j < lth2; j++) {
                if (first[i] == second[j]) {
                    // Check for duplicates in the result array
                    boolean isDuplicate = false;
                    for (int k = 0; k < count; k++) {
                        if (tempResult[k] == first[i]) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    // Add to result if not a duplicate
                    if (!isDuplicate) {
                        tempResult[count] = first[i];
                        count++;
                    }
                    break;
                }
            }
        }

        // Copy the valid part of tempResult to the final result array
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = tempResult[i];
        }

        return result;
    }
}

public class test5_1 {
    public static void main(String[] args) {
        char[] iarr = {'a', 'b', 'c'};
        char[] rarr = lengthChar(iarr, 0, 1);

        if (rarr == null) {
            System.out.println("null");
        } else {
            System.out.println(java.util.Arrays.toString(rarr));
        }
    }

    public static char[] lengthChar(char[] arr, int start, int length) {
        int lth = arr.length;

        // Check for invalid cases
        if (lth == 0 || start < 0 || length < 0 || start >= lth || start + length > lth) {
            return null;
        }

        // If length is 0, return an empty array
        if (length == 0) {
            return new char[0];
        }

        // Initialize array to store the result
        char[] result = new char[length];

        // Copy elements from arr to result
        for (int i = 0; i < length; i++) {
            result[i] = arr[start + i];
        }

        return result;
    }
}

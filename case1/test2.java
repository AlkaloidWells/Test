public class test2 {
    public static void main(String[] args) {
        int[] myArray = {9, 0, 7, 8, 1, 10, 0};
        int lth = myArray.length;
        int count = 0;  // pointer for placing non-zero elements

        // Move non-zero elements to the front
        for (int i = 0; i < lth; i++) {
            if (myArray[i] != 0) {
                myArray[count] = myArray[i];
                count++;
            }
        }

        // Fill the rest with zeros
        while (count < lth) {
            myArray[count] = 0;
            count++;
        }

        System.out.println("Array after moving zeroes: " + java.util.Arrays.toString(myArray));
    }
}

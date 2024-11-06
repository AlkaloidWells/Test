public class test6 {
    public static void main(String[] args) {
        int value = 1234;
        int reversedValue = reverseNum(value);
        System.out.println(reversedValue); // Output: 4321
    }

    public static int reverseNum(int number) {
        int reversed = 0;
        
        while (number != 0) {
            int lastDigit = number % 10;  // Get the last digit
            reversed = reversed * 10 + lastDigit;  // Append it to reversed
            number /= 10;  // Remove the last digit from number
        }

        return reversed;
    }
}

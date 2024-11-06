public class test8 {
    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1, 2, 1}));               // 1
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));   // 1
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));// 0
        System.out.println(is121Array(new int[]{1, 1, 2, 1, 2, 1, 1}));   // 0
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3})); // 0
        System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1}));      // 0
        System.out.println(is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1})); // 0
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2})); // 0
        System.out.println(is121Array(new int[]{2, 2, 2}));               // 0
    }

    public static int is121Array(int[] a) {
        if (a == null || a.length < 3 || a[0] != 1) {
            return 0; 
        }

        int leftOnes = 0; 
        int rightOnes = 0; 
        int i = 0;

        while (i < a.length && a[i] == 1) {
            leftOnes++;
            i++;
        }

        int middleTwos = 0;
        while (i < a.length && a[i] == 2) {
            middleTwos++;
            i++;
        }

        while (i < a.length && a[i] == 1) {
            rightOnes++;
            i++;
        }

        if (i != a.length || leftOnes != rightOnes || middleTwos == 0) {
            return 0;
        }

        return 1; 
    }
}

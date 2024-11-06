public class test3{
    public static void main(String[] args){

        int[] arry = {10};
        int x = centerd_array(arry);

        System.out.println("Is Centerd: "+ x);

    }

    public static int centerd_array(int[] arr){
        int lth = arr.length;
        
        if (lth%2==0 | lth==0){

            System.out.println("Is Centerd1: "+ 0);

            return 0;
        }


        for(int i = 0; i<lth; i++){
            if (arr[i] < (arr[((lth/2))])){
                return 0;
            }

        }
        return 1;


    }
}
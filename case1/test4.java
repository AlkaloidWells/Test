public class test4{
    public static void main(String[] args){
        int[] arr = {1, 1};
        int v = diff(arr);
        System.out.println("diff: "+ v);
    }

    public static int diff(int[] arr){

        if (arr.length==0){

            return 0;
        }
        int ceven=0;
        int codd=0;
        

        for (int i =0; i<arr.length; i++){
            if(arr[i]%2 ==0){
                ceven = ceven+arr[i];
            }

            else 
                codd = codd+arr[i];

        }

        return (codd - ceven);


    }
}
public class test5{
    public static void main(String[] args){
        char [] iarr = {'a', 'b', 'c'};
        char [] rarr =lenthchar(iarr, 1, 0);

        if(rarr==null){
            System.out.println("null");
        }
        else
            System.out.println(java.util.Arrays.toString(rarr));

    }


    public static char[] lenthchar(char[] arr, int start, int lenth){

        int lth = arr.length;
        

        if (lth==0 || start<0 || lenth<0 || start>=lth || lenth>lth || ((lenth+start)>lth)) {

            return null;

        }


        if (lenth == 0) {
            return new char[0];
        }

        // Initialize array to store the result
        char[] arry = new char[lenth];

        for(int i = 0; i<lenth; i++){

            arry[i] = arr[start+i];
            

        }
        return arry;


    }
}
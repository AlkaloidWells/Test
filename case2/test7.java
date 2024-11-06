public class test7 {
    public static void main(String[] args) {
        int[] first = {1, 3, 6, 6, 4};
        int[] second = {4, 5, 6};

        int[] finaln = union(first, second);

        System.out.println("common elemneyts: " + java.util.Arrays.toString(finaln));
    }

    public static int[] union(int[] first, int[] second){

        if (first==null || second==null){
            return null;
        }

        int lth1 = first.length;
        int lth2 = second.length;

        if (lth1==0 || lth2==0){

            return new int[0];

        }
        int count=0;

        int [] result = new int[Math.min(lth1, lth2)];

        for(int i = 0; i<lth1; i++){
            for(int j=0; j<lth2; j++){
                if(first[i]==second[j]){
                    boolean isduplicate = false;
                    for(int k = 0; k<count; k++){
                        
                        if(result[k] == first[i]){
                            isduplicate = true;
                        }

                    }

                    if(!isduplicate){
                        result[count] = first[i];
                        count++;
                    }
                }
            }


        }

        int[] result1 = new int[count];
        for (int i = 0; i < count; i++) {
            result1[i] = result[i];
        }
        return result1;

    }
}

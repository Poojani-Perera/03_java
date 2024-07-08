public class q6 {
    public static void main(String[] args) {
        int [] q6= {10,20,5,40,50};

        int minValue = q6[0];                       //min = 5
            for (int i = 0; i < q6.length; i++) {      //i=0 ,1,2,3
                if (q6[i] < minValue) {
                    minValue = q6[i];
                }
            }
        System.out.println(minValue);

    }
}


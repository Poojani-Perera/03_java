public class q6 {
    public static void main(String[] args) {
        int [] q6= {10,20,30,40,50};

        int minValue = q6[0];
            for (int i = 1; i < q6.length; i++) {
                if (q6[i] < minValue) {
                    minValue = q6[i];
                }
            }
            return minValue;

        /* int minValue = findMinValue(q6);
        System.out.println("The minimum value in the array is: " + minValue); */
    }
}


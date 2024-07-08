public class q5 {
    public static void main(String[] args) {
        int [] q5= {10,20,30,40,50};

        int max = q5[0]; // Initialize max to the first element of the array


        for (int i = 0; i < q5.length; i++) {                 //max -50
                                                                //i= 0 ,1,2 ,3,4,5.......
            if (q5[i] > max) {
                max = q5[i];                                // Update max if the current element is greater
            }
        }

        System.out.println(max);
    }
}

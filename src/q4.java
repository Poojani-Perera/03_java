public class q4 {
    public static void main(String[] args) {
        int [] q4 = {10,20,30,40,50};

        double avg =0;
        double sum =0;

        int num = q4.length;

        for (int val : q4) {
            sum += val;
        }
        avg = sum / num;

        System.out.println("The average age is: " + avg);
    }
}

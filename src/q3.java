public class q3 {
    public static void main(String[] args) {
        int [] q3 = {10,20,30,40,50};
          int sum=0;
          int sum2 =q3[0]+q3[1]+q3[2]+q3[3]+q3[4];    // manual method print sum

        for ( int i = 0; i < q3.length; i++) {         //for loop
             sum += q3[i];
        }

        System.out.println("The sum is: " + sum);
    }
}

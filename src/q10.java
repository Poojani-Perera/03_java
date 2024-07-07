import java.util.Arrays;
public class q10 {
    public static void main(String[] args) {
        int [] num= {10,20,30,40,50};

        int result  = Arrays.binarySearch(num,2);      //array searching
        System.out.println(result);

        if (result>=0){
            System.out.println("found");

        }else {
            System.out.println("not found");
        }

    }
}

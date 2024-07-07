import java.util.Arrays;

public class q8 {
    public static void main(String[] args) {
        int [] q8= {10,20,30,40,50};

        int [] copy = Arrays.copyOf(q8, 4);      //copy array
        System.out.println("copy array:"+Arrays.toString(copy));

    }
}

public class q7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,6,7,8};
        System.out.print("[");

        System.out.print(array[7]+", "+ array[6]+", "+array[5]+", "+array[4]+", "+array[3]+", "+array[2]+", "+array[1]+", "+array[0]+", ");
        System.out.println("]");   //       manul

        for (int i = array.length - 1; i >=0; i--) {                 //         Array Reverse with for loop
            System.out.print(array[i]+",");
        }


    }
}


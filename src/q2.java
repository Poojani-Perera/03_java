public class q2 {
    public static void main(String[] args) {
        int [] q2 = {10,20,30,40,50};

        System.out.print("[");           //Array Traversal
        for ( int i=0;i< q2.length;i++){    //array print with  forloop
            System.out.print(q2[i]+",");
        }
        System.out.println( "]");


        ////////////////////////// for each loop only use with array

        System.out.print("[");
        for ( int num: q2) {    //for each loop
            System.out.print(num +",");

        }
        System.out.println("]");


    }
}

public class q5 {
    public static void main(String[] args) {
        int [] q5= {10,20,30,40,50};

        int max = q5[0]; // Initialize max to the first element of the array
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < q5.length; i++) {
            if (q5[i] > max) {
                max = q5[i]; // Update max if the current element is greater
            }
        }
        
        return max;              // Return the maximum value found



       /* ///////////////////////////////////

        // Calling the method to find the maximum value
        int maxValue = findMax(q5);
        System.out.println("The maximum value in the array is: " + maxValue);

/*


    }
}

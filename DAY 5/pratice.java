public class pratice {
    public static void main(String[] args) {
        /*
         * Problem 1: 1D Array Sum
         * Create an int[] with 5 values
         * Print the sum of all elements
         */

        int[] nums = { 10, 20, 30, 40, 50 };
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println(sum);

        /*
         * Problem 2: 2D Array Print
         * Create a 2x2 int matrix
         * Print each element in row/column format
         */
        int[][] box = {
                { 1, 2 },
                { 3, 4 }
        };

        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {
                System.out.print(box[i][j] + " ");
            }
            System.out.println();
        }

        /*
         * Problem 3: String Basics
         * Create a String with "hello world"
         * Print:
         * Length
         * Uppercase
         * 1st and 5th characters
         * Does it contain "world"?
         */

        String h = "Hello World";
        System.out.println(h.length());
        System.out.println(h.toUpperCase());
        System.out.println(h.charAt(1));
        System.out.println(h.charAt(5));
        System.out.println(h.toLowerCase().contains("world")); 

        /*
        Problem 4: StringBuilder Use
        Create a StringBuilder with "Java"
        Append " is awesome"
        Reverse it and print
         */

        StringBuilder ab = new StringBuilder("java");
        ab.append("is awesome");
        System.out.println(ab.reverse());

        String a = "Test";
        String b = "Test";
        String c = new String("Test");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

    }
}

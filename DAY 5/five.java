public class five {
    public static void main(String[] args) {
        // 1D Array Examples

        int[] nums = { 10, 20, 30 };
        System.out.println(nums[0]);

        // 2D Array Examples

        int[][] matrix = {
                { 1, 2 },
                { 3, 4 }
        };
        System.out.println(matrix[1][0]);

        // String Class – Immutable & Useful Methods

        String a = "Hello";
        a.concat("World");
        System.out.println(a);
        // It will not add world because Strings are immutable means they are not
        // changeable Once they are formed

        String s = "Java";
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.toUpperCase());
        System.out.println(s.equals("java"));
        System.out.println(s.equalsIgnoreCase("java"));

        // StringBuilder vs StringBuffer

        StringBuilder sb = new StringBuilder();
        sb.append("Hi ");
        System.out.println(sb);
        sb.append("Hello I am an Engineer");
        System.out.println(sb);


        StringBuffer sv = new StringBuffer();

        String j = "Java";
        String v = "java";
        System.out.println(j == v);



    }
}

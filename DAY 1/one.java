import java.util.ArrayList;
import java.util.List;

public class one {
    public static void main(String[] args) {

        /*
         * 1. Widening Conversion:
         * Convert byte to int, and int to double
         */
        byte b = 42;
        System.out.println((int) b);
        System.out.println(b);

        int a = 45;
        System.out.println((double) a);

        /*
         * 2. Narrowing Conversion:
         * // Convert double to int and print both before and after values
         */

        double d = 9.876;
        System.out.println(d);
        System.out.println((int) d);

        /*
         * 3. Autoboxing & Unboxing:
         * // Autobox an int into Integer and unbox back to int
         */
        // //Autoboxing
        int v = 100;
        Integer obj = v;
        System.out.println(obj);

        // //Inboxing
        Integer x = 30;
        int c = x;
        System.out.println(c);

        /*
         * 4. Wrapper with Collections:
         * // Add 5 integers to a List and print their squares using autoboxing
         */

        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        for(Integer num:nums){
        System.out.println("Square of " + num + " is " + ( num * num ));
        }

        // Challenge: Wrapper with List – Even/Odd Filter

        List <Integer> num = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);

        for(Integer numbers:nums){
        if(numbers % 2 == 0){
        System.out.println("It is a even number");
        }
        else{
        System.out.println("It is an odd number");
        }
        }

        // 5. Operator Practice (Pre/Post Increment + Ternary)
        // Task: Use pre-increment, post-increment, and ternary operator. Predict and
        // print results.

        int g = 5;
        int h = 10;
        System.out.println("Pre-increment: " + (++g));
        System.out.println("Post-increment: " + (h++));
        System.out.println("Value of b now: " + h);
        int max = (g > h) ? g : h;
        System.out.println("Greater value between a and b is: " + max);

        int z = 7;
        int y = 12;
        System.out.println("Pre-increment: " + (++z));
        System.out.println("Post-Increment: " + (y++));
        System.out.println("Value of x now: " + y);
        int maximum = (z > y) ? z:y;
        System.out.println("Greater value between x and y is: " + maximum);

    }
}
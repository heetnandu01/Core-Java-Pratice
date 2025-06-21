import java.util.Scanner;

public class pratice {

    /*
     * Problem 2: Throw Keyword
     * Create a method that checks age
     * If age < 18, throw "Not eligible to vote"
     */

    void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not Eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
    /*
     * Problem 3: Access Modifier
     * Create a class with:
     * private int salary
     * public String name
     * Try accessing both from main
     */

    static class employee {
        private int salary;
        public String name;

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }

    }
    /*
     * Problem 5: Switch Statement
     * Take a number 1-3 and print:
     * 1 → "One"
     * 2 → "Two"
     * 3 → "Three"
     * default → "Invalid"
     */

    public static void main(String[] args) {
        /*
         * Problem 1: Try-Catch
         * Divide 10 by 0 and catch ArithmeticException
         */

        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Can't Divide by zero");
        }

        employee e = new employee();
        e.setSalary(50000);
        System.out.println(e.name);
        System.out.println(e.getSalary());

        /*
         * Problem 4: Loop + Continue
         * Print numbers 1 to 10 but skip even numbers
         */

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of em: ");
        int em = sc.nextInt();
        switch (em) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid");
        }

        pratice obj = new pratice();
        obj.checkAge(15); 
        obj.checkAge(20); 

    }
}

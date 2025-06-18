public class third {

    // 1. Basic Method
    void greet() {
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        third obj = new third();
        obj.greet();
    }
    // Method With Parameters + Return

    int add(int a, int b) {
        return a + b;
    }

    // 3. Static vs Instance Method

    static void sayhello() {
        System.out.println("Hi from a Static method ");
    }

    void sayhi() {
        System.out.println("Hi from Instance method");
    }

    // 4. Method Overloading

    void print() {
        System.out.println("No args");
    }

    void print(String name) {
        System.out.println("Hello " + name);
    }

    // 5. this keyword
    class Student {
        String name;

        void setName(String name) {
            this.name = name;
        }
    }

    // Recursion (Basic)
    int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

}
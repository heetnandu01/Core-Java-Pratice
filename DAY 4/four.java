public class four {
    // 1.Inheritance - define classes outside or make the classes static
    static class animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class dog extends animal {
        void bark() {
            System.out.println("Dog barks");
        }
    }

    // 2.Method Overriding

    class bird {
        void fly() {
            System.out.println("The bird is flying");
        }
    }

    class eagle extends bird {
        void fly() {
            System.out.println("fastest bird knowm to mankind");
        }
    }

    /*
     * 3.Polymorphism -
     * i)Method overloading (Compile time polymorphism)
     */

    class calculator {
        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }
    }
    /*
     * ii)Run-time Polymorphism Method Overriding
     */

    class fruit {
        void taste() {
            System.out.println("It is tasty");
        }
    }

    class mango extends fruit {
        void taste() {
            System.out.println("It is the king of the fruits.");
        }
    }

    // 4.Abstraction

    abstract class Shape {
        abstract void draw();
    }

    class Circle extends Shape {
        void draw() {
            System.out.println("Drawing Circle");
        }
    }

    // 5.Encapsulation

    class employee {
        private int salary;

        public int getSalary() {
            return salary;
        }

        public void setSalary() {
            this.salary = salary;
        }
    }

    /*
     * Inheritance ➝ reuse
     * Overriding ➝ specialization
     * Polymorphism ➝ many forms
     * Abstraction ➝ design only essentials
     * Encapsulation ➝ secure your data
     */
    
    public static void main(String[] args) {
        dog l = new dog();
        l.bark();
        l.sound();
    }
}

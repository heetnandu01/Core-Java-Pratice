public class two {
    String brand = "Maruti";
    int speed = 200;

    public static void main(String[] args) {
        // 1.Class and Object
        two car = new two();
        System.out.println(car.brand);
        System.out.println(car.speed);

        // 2.POJO Class (Plain Old Java Object)
        /*
         * Simple class with:
         * Private fields
         * Public constructors
         * Getters/Setters
         * No business logic
         */

        class student {
            private String name;
            private int age;

            // Constructor
            public student(String name, int age) {
                this.name = name;
                this.age = age;
            }

            // Getters
            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

            // Setters
            public void setName(String name) {
                this.name = name;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }

        // 3. Default vs Parameterized Constructor

        class dog {
            String breed;

            // Default Cobstructor
            dog() {
                breed = "Labrador";
            }

            // Parameterized Constructor

            dog(String breed) {
                this.breed = breed;
            }
        }

        // 4. this Keyword

        class Employee {
            String name;

            Employee(String name) {
                this.name = name; // refers to instance variable
            }
        }

        // 5. super Keyword

        class Animal {
            Animal() {
                System.out.println("Animal Constructor");
            }
        }

        class Dog extends Animal {
            Dog() {
                super(); 
                System.out.println("Dog Constructor");
            }
        }

    }

}

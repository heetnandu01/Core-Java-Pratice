// Inheritance 

class vehicle{
    void start(){
        System.out.println("Vehicle Started");
    }
}

class car extends vehicle{
    void drive(){
        System.out.println("Car is driving");
    }
}



// Method Overriding

class animal{
    void makeSound(){
        System.out.println("Animal sound");
    }
}

class dog extends animal{
    void makeSound(){
        System.out.println("Dog barks");
    }
}

// Polymorphism - Method Overriding

class shape{
    void draw(){
        System.out.println("Drawing shape");
    }
}

class circle extends shape{
    void draw(){
        System.out.println("Drawing circle");
    }
}

// compile-time Polymorphism - Method Overloading

class calculator{
    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }
}


// Abstraction

abstract class bank{
    abstract void getInterestRate();
}

class sbi extends bank{
    void getInterestRate(){
        System.out.println("Interest rate is ");
    }
}


// Encapsulation

class employee{
    private int salary;


    public int  getSalary(){
        return salary;
    }

    public void setSalary(){
        this.salary = salary;
    }
}




public class pratice {
    public static void main(String[] args) {
        car v = new car();
        v.start();
        v.drive();  

        animal an = new animal();
        an.makeSound();
        
        dog d = new dog();
        d.makeSound();


        shape s = new shape();
        s.draw();

        calculator c = new calculator();
        c.add(15, 45);
        c.add(15,30,25);


        employee e = new employee();
        e.setSalary();
        e.getSalary();
        
    }
}
public class pratices {
    public static void main(String[] args) {
        car car1 = new car(); 
        car car2 = new car("Toyota"); 

        System.out.println("Car 1 model: " + car1.model);
        System.out.println("Car 2 model: " + car2.model);
    }
}

class car {
    String model;

    car() {
        model = "Suzuki";
    }

    car(String model) {
        this.model = model;
    }
}

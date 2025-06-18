public class pratice {
    private String brand;
    int add(int a,int b){
        return a+b;
    }

    void print(){
        System.out.println("Hello");
    }

    void print(String name){
        System.out.println("Hello");
    }


    class laptop{
        String brand;
    }

    void setBrand(String brand){
        this.brand = brand;
    }
    public static void main(String[] args) {
        pratice obj = new pratice();
        System.out.println(obj.add(5, 15));
    }   
}

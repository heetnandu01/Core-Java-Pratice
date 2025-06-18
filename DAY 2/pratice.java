public class pratice{
    String name = "Heet";
    int age = 20;
    public static void main(String[] args) {
        // pratice human = new pratice();
        // System.out.println(human.name);
        // System.out.println(human.age);

        pratice outer = new pratice();
        Employee emp = outer.new Employee("Riya", 50000);
        System.out.println(emp.getName() + " earns " + emp.getSalary());

     
     

    }   
    
    

    class Employee{
        private String name;
        private int salary;

        //Constructors 
        public Employee(String name, int salary){
            this.name = name;
            this.salary = salary;
        }

        //Getters 

        public String getName(){
            return name;
        }
        public int getSalary(){
            return salary;
        }


        // setters 

        public void setName(String name){
            this.name = name;
        }
        public void setSalary(int salary){
            this.salary = salary;
        }
    }
}

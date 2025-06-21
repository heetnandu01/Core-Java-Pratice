public class six {

    // throws example
    static void riskyMethod() throws ArithmeticException {
        int x = 10 / 0;
    }

    // throw example
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }

    public static void main(String[] args) {

        // Basic Try-Catch 
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Can't Divide by zero");
        }

        // Finally block
        try {
            System.out.println("Try Block");
        } finally {
            System.out.println("Always runs");
        }

        // throws example
        try {
            riskyMethod();
        } catch (ArithmeticException e) {
            System.out.println("Caught from riskyMethod(): " + e.getMessage());
        }

        // throw example
        try {
            checkAge(15);
        } catch (ArithmeticException e) {
            System.out.println("Caught from checkAge(): " + e.getMessage());
        }

        checkAge(21);

        //If-else ,Switch 

        int x = 10;
        if(x>9){
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is not positive");
        }

        switch(x){
            case 1:System.out.println("One");
            break;
            default:System.out.println("Other");
        }

        //Loops - for,do,while

        for(int i =0;i < 5;i++){
            System.out.println(i);
        }


        int i =0;
        while(i < 3){
           System.out.println(i);
           i++; 
        }

        // break, continue, return
        
        for(int k = 1;k <= 5 ;k++){
            if(k == 3){
                continue;
            }
            System.out.println(k);
        }
    }
}

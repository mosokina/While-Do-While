package mentoring;

public class whileLoop_Factorial {

    //The factorial function says to multiply all whole numbers from our chosen number down to 1.
    // Examples: 6 × 5 × 4 × 3 × 2 × 1 ...

    public static void main(String[] args) {
        int num=6;

        //initialization
        int factorial = 1; //where we store numbers
        int i = 1;

        while(i<=num) {
            factorial = factorial*i;
            i++;
        }

        System.out.println("Factorial of "+num+" is : "+factorial);
    }
}

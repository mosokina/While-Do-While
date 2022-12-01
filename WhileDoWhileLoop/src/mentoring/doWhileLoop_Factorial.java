package mentoring;

public class doWhileLoop_Factorial {
    public static void main(String[] args) {
        //find the factorial of a number
        int n=6;

        //initialization
        int factorial = 1;
        int i = 1;

        do {
            factorial = factorial*i;
            i++;
        } while(i <= n);

        System.out.println("Factorial of " + n + " : " + factorial);
    }
}

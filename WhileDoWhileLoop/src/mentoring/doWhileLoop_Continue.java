package mentoring;

public class doWhileLoop_Continue {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i == 3) {
                i++;
                continue;
                //You can skip the execution of code block by using continue statement.
            }
            System.out.println("hello world " + i);
            i++;
        } while(i < 8);
    }
}

package mentoring;

public class doWhileLoop_Break {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i == 3) {
                break;
            }
            System.out.println("hello world " + i);
            i++;
        } while(i < 8);
    }
}

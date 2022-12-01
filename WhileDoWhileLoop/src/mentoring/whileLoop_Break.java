package mentoring;

public class whileLoop_Break {

    public static void main(String[] args) {

        //initialization
        int i=1;
        while(i<6) {
            if(i==4) {
                break;
            }
            System.out.println(i);

            //update
            i++;
        }
    }
}

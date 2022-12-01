package mentoring;

public class whileLoop_Continue {
    public static void main(String[] args) {

        //initialization
        int i=1;
        while(i<6) {
            if(i==4) {
                i++;
                continue;
            }
            System.out.println(i);

            //update
            i++;
        }
    }
}

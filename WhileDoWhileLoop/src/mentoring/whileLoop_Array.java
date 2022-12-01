package mentoring;

public class whileLoop_Array {

    public static void main(String[] args) {
        String[] phones = {"Apple", "Android", "Xiaomi", "Lenovo"};

        //initialization
        int i = 0;

        while(i<phones.length) {
            System.out.println("I have "+phones[i] + " smartphone.");
            i++;
        }
    }
}

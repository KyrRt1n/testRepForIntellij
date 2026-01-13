public class task2 {

    static String hell = new String("Hello");
    static String hall = new String("Hello");

    public static void main(String[] args) {


        System.out.println(hell == hall);
        System.out.println(hell.equals(hall));

        Integer k = -128;
        for (int i = -128; i <= 128; i++) {
            System.out.print(i);
            System.out.print(", ");
            System.out.print(k);
            System.out.println(i==k);
            k++;
        }
    }


}

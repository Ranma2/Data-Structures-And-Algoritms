public class Main {
    public static void main(String[] args) {
       String first = "Croissant";
       String second = "Chouquettes";

       // creates an object p
       Pair <String> p = new Pair<>(first, second);

       /*
       outputs the before values
        */
        System.out.println("Before the swap the first value is : " + first + " and the second value is : " + second);

        /*
        call the method swap
         */
        p.swap();

        /*
         outputs the after values
         */
        System.out.println("After the swap the first value is : " + p.getFirst() + " and the second value is : " + p.getSecond());
    }
}
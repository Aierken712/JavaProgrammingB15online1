package Day17;

public class Practice {

    public static void main(String[] args) {

        String name = "Aierken Aierxiati";
        int x = 0;
        while ( x < name.length() ) {
            System.out.print(name.charAt(x) + "|");
            ++x;
        }
        System.out.println();
        System.out.println("--------------------------------------");

        int y = 1;
        while ( y < name.length() ) {
            System.out.print(y-1 + "|");
            y++;
        }







    }
}
